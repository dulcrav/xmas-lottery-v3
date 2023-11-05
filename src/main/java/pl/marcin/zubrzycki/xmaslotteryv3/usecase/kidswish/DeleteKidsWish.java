package pl.marcin.zubrzycki.xmaslotteryv3.usecase.kidswish;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.gateway.kidswish.KidsWishRepository;

@Service
public class DeleteKidsWish {
    private final KidsWishRepository kidsWishRepository;

    public DeleteKidsWish(KidsWishRepository kidsWishRepository) {
        this.kidsWishRepository = kidsWishRepository;
    }

    public void execute(Long id) {
        kidsWishRepository.deleteById(id);
    }
}
