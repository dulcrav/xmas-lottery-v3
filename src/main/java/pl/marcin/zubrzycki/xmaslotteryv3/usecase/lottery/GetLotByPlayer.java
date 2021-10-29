package pl.marcin.zubrzycki.xmaslotteryv3.usecase.lottery;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.lottery.LotteryResults;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.lottery.LotteryResultsGateway;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.UserGateway;

@Service
public class GetLotByPlayer {
    private final LotteryResultsGateway lotteryResultsGateway;
    private final UserGateway userGateway;

    public GetLotByPlayer(LotteryResultsGateway lotteryResultsGateway, UserGateway userGateway) {
        this.lotteryResultsGateway = lotteryResultsGateway;
        this.userGateway = userGateway;
    }

    public LotteryResults execute(Long id) {
        return userGateway.findById(id)
                .map(lotteryResultsGateway::findByUserPlayer)
                .orElse(null);
    }
}
