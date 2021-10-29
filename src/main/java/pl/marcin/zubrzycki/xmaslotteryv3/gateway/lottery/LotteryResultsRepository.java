package pl.marcin.zubrzycki.xmaslotteryv3.gateway.lottery;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.lottery.LotteryResults;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;

public interface LotteryResultsRepository extends JpaRepository<LotteryResults, Long> {
    LotteryResults findByUserPlayer(User user);
}
