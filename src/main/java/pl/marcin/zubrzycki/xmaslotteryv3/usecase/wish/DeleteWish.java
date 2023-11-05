package pl.marcin.zubrzycki.xmaslotteryv3.usecase.wish;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.gateway.wish.WishRepository;

@Service
public class DeleteWish {
    private final WishRepository wishRepository;

    public DeleteWish(WishRepository wishRepository) {
        this.wishRepository = wishRepository;
    }

    public void execute(Long wishId) {
        wishRepository.deleteById(wishId);
    }

    public void executeForAll() {
        wishRepository.deleteAll();
    }
}
