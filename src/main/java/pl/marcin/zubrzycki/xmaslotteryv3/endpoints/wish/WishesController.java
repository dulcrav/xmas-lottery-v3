package pl.marcin.zubrzycki.xmaslotteryv3.endpoints.wish;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.wish.Wish;
import pl.marcin.zubrzycki.xmaslotteryv3.endpoints.wish.dto.NewWishDto;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.wish.AddWish;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.wish.GetWishes;

import java.util.List;

@RestController
@RequestMapping("/api/xmas/test/wish")
@CrossOrigin
public class WishesController {
    private final AddWish addWish;
    private final GetWishes getWishes;

    public WishesController(AddWish addWish, GetWishes getWishes) {
        this.addWish = addWish;
        this.getWishes = getWishes;
    }

    @PostMapping("/add")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<Wish> addWish(@RequestBody NewWishDto newWishDto) {
        return ResponseEntity.ok(addWish.execute(newWishDto));
    }

    @GetMapping("/all")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<List<Wish>> findAllUserWishes(@RequestParam Long userId) {
        return ResponseEntity.ok(getWishes.execute(userId));
    }
}
