package pl.marcin.zubrzycki.xmaslotteryv3.domain.kidswish;

import java.util.List;

public interface KidsWishGateway {

    KidsWish save(KidsWish kidsWish);

    List<KidsWish> findAll();
}
