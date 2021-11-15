package pl.marcin.zubrzycki.xmaslotteryv3.usecase.wish;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.UserGateway;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.wish.Wish;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.wish.WishGateway;

import java.util.List;

@Service
public class GetWishes {
    private final WishGateway wishGateway;
    private final UserGateway userGateway;

    public GetWishes(WishGateway wishGateway, UserGateway userGateway) {
        this.wishGateway = wishGateway;
        this.userGateway = userGateway;
    }

    public List<Wish> execute(Long userId) {
        return userGateway.findById(userId)
                .map(wishGateway::findAllByUser)
                .orElse(null);
    }

    public List<Wish> executeForAll() {
        return wishGateway.findAll();
    }
}
