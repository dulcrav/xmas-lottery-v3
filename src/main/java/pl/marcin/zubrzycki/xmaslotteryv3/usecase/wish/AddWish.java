package pl.marcin.zubrzycki.xmaslotteryv3.usecase.wish;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.wish.Wish;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.wish.WishGateway;
import pl.marcin.zubrzycki.xmaslotteryv3.endpoints.wish.dto.NewWishDto;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.user.GetUser;

@Service
public class AddWish {
    private final GetUser getUser;
    private final WishGateway wishGateway;

    public AddWish(GetUser getUser, WishGateway wishGateway) {
        this.getUser = getUser;
        this.wishGateway = wishGateway;
    }

    public Wish execute(NewWishDto newWishDto) {
        User user = getUser.byId(newWishDto.getUserId());
        Wish wish = new Wish(user, newWishDto.getName());
        return wishGateway.save(wish);
    }
}
