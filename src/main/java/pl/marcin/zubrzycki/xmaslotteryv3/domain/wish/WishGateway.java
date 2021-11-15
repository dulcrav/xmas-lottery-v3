package pl.marcin.zubrzycki.xmaslotteryv3.domain.wish;

import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;

import java.util.List;

public interface WishGateway {
    Wish save(Wish wish);

    List<Wish> findAllByUser(User user);

    List<Wish> findAll();
}
