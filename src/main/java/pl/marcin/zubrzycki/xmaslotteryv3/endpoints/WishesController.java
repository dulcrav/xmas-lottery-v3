package pl.marcin.zubrzycki.xmaslotteryv3.endpoints;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.wish.Wish;
import pl.marcin.zubrzycki.xmaslotteryv3.endpoints.dto.WishDto;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.wish.AddWish;

@RestController
@RequestMapping("/api/xmas/test/wish")
@CrossOrigin
public class WishesController {
    private final AddWish addWish;

    public WishesController(AddWish addWish) {
        this.addWish = addWish;
    }

    @PostMapping("/add")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<Wish> addWish(@RequestBody WishDto wishDto) {
        return ResponseEntity.ok(addWish.execute(wishDto));
    }
}
