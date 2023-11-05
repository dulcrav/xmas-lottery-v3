package pl.marcin.zubrzycki.xmaslotteryv3.gateway.kidswish;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.kidswish.KidsWish;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.kidswish.KidsWishGateway;

import java.util.List;

@Service
public class KidsWishDbGateway implements KidsWishGateway {

    private final KidsWishRepository kidsWishRepository;

    public KidsWishDbGateway(KidsWishRepository kidsWishRepository) {
        this.kidsWishRepository = kidsWishRepository;
    }

    @Override
    public KidsWish save(KidsWish kidsWish) {
        return kidsWishRepository.save(kidsWish);
    }

    @Override
    public List<KidsWish> findAll() {
        return kidsWishRepository.findAll();
    }
}
