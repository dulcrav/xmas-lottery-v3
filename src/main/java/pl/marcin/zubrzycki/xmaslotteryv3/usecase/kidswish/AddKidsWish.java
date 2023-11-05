package pl.marcin.zubrzycki.xmaslotteryv3.usecase.kidswish;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.kidswish.KidsWish;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.kidswish.KidsWishGateway;
import pl.marcin.zubrzycki.xmaslotteryv3.endpoints.kidswish.dto.NewKidsWishDto;

@Service
public class AddKidsWish {
    private final KidsWishGateway kidsWishGateway;

    public AddKidsWish(KidsWishGateway kidsWishGateway) {
        this.kidsWishGateway = kidsWishGateway;
    }

    public KidsWish execute(NewKidsWishDto newKidsWishDto) {
        KidsWish kidsWish = new KidsWish(newKidsWishDto.getKidName(), newKidsWishDto.getWish());
        return kidsWishGateway.save(kidsWish);
    }
}
