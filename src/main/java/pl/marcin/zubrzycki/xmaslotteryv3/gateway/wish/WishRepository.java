package pl.marcin.zubrzycki.xmaslotteryv3.gateway.wish;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.wish.Wish;

import java.util.List;

public interface WishRepository extends JpaRepository<Wish, Long> {
    List<Wish> findAllByUser(User user);
}
