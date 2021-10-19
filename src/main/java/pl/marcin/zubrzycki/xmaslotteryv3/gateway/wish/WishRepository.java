package pl.marcin.zubrzycki.xmaslotteryv3.gateway.wish;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.wish.Wish;

public interface WishRepository extends JpaRepository<Wish, Long> {
}
