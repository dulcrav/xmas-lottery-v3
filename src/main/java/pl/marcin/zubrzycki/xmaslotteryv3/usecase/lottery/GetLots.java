package pl.marcin.zubrzycki.xmaslotteryv3.usecase.lottery;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.lottery.LotteryResults;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.lottery.LotteryResultsGateway;

import java.util.Collection;

@Service
public class GetLots {
    private final LotteryResultsGateway lotteryResultsGateway;

    public GetLots(LotteryResultsGateway lotteryResultsGateway) {
        this.lotteryResultsGateway = lotteryResultsGateway;
    }

    public Collection<LotteryResults> execute() {
        return lotteryResultsGateway.findAll();
    }
}
