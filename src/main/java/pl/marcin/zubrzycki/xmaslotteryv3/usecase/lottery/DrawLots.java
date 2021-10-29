package pl.marcin.zubrzycki.xmaslotteryv3.usecase.lottery;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.lottery.LotteryResults;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.lottery.LotteryResultsGateway;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.UserGateway;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class DrawLots {
    private final LotteryResultsGateway lotteryResultsGateway;
    private final UserGateway userGateway;
    private final ClearLots clearLots;

    public DrawLots(LotteryResultsGateway lotteryResultsGateway, UserGateway userGateway, ClearLots clearLots) {
        this.lotteryResultsGateway = lotteryResultsGateway;
        this.userGateway = userGateway;
        this.clearLots = clearLots;
    }

    public List<LotteryResults> execute() {
        clearLots.execute();

        List<User> allUsers = userGateway.findAllUsers();
        List<LotteryResults> results = new ArrayList<>();

        Collections.shuffle(allUsers);

        for (int i = 0; i < allUsers.size() - 1; i++) {
            results.add(new LotteryResults(allUsers.get(i), allUsers.get(i+1)));
        }
        results.add(new LotteryResults(allUsers.get(allUsers.size() - 1), allUsers.get(0)));

        lotteryResultsGateway.saveAll(results);
        return results;
    }
}
