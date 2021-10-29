package pl.marcin.zubrzycki.xmaslotteryv3.usecase.lottery;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.lottery.LotteryResultsGateway;

@Service
public class ClearLots {
    private final LotteryResultsGateway lotteryResultsGateway;

    public ClearLots(LotteryResultsGateway lotteryResultsGateway) {
        this.lotteryResultsGateway = lotteryResultsGateway;
    }

    public void execute() {
        this.lotteryResultsGateway.deleteAll();
    }
}
