package pl.marcin.zubrzycki.xmaslotteryv3.usecase.kidswish;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.kidswish.KidsWish;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.kidswish.KidsWishGateway;

import java.util.List;

@Service
public class GetKidsWishes {
    private final KidsWishGateway kidsWishGateway;

    public GetKidsWishes(KidsWishGateway kidsWishGateway) {
        this.kidsWishGateway = kidsWishGateway;
    }

    public List<KidsWish> execute() {
        return kidsWishGateway.findAll();
    }
}
