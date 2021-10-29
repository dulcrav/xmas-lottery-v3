package pl.marcin.zubrzycki.xmaslotteryv3.domain.lottery;

import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;

import java.util.Collection;
import java.util.List;

public interface LotteryResultsGateway {
    Collection<LotteryResults> findAll();

    List<LotteryResults> saveAll(List<LotteryResults> results);

    void deleteAll();

    LotteryResults findByUserPlayer(User user);
}
