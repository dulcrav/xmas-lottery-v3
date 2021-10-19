package pl.marcin.zubrzycki.xmaslotteryv3.gateway.wish;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.wish.Wish;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.wish.WishGateway;

@Service
public class WishDbGateway implements WishGateway {
    private final WishRepository wishRepository;

    public WishDbGateway(WishRepository wishRepository) {
        this.wishRepository = wishRepository;
    }

    @Override
    public Wish save(Wish wish) {
        return wishRepository.save(wish);
    }
}
