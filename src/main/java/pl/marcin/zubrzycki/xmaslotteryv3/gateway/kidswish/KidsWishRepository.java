package pl.marcin.zubrzycki.xmaslotteryv3.gateway.kidswish;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.kidswish.KidsWish;

public interface KidsWishRepository extends JpaRepository<KidsWish, Long> {
}
