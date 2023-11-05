package pl.marcin.zubrzycki.xmaslotteryv3.endpoints.kidswish;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.kidswish.KidsWish;
import pl.marcin.zubrzycki.xmaslotteryv3.endpoints.kidswish.dto.NewKidsWishDto;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.kidswish.AddKidsWish;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.kidswish.DeleteKidsWish;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.kidswish.GetKidsWishes;

import java.util.List;

@RestController
@RequestMapping("/api/xmas/test/kidswish")
@CrossOrigin
public class KidsWishesController {

    private final AddKidsWish addKidsWish;
    private final GetKidsWishes getKidsWishes;
    private final DeleteKidsWish deleteKidsWish;

    public KidsWishesController(AddKidsWish addKidsWish, GetKidsWishes getKidsWishes, DeleteKidsWish deleteKidsWish) {
        this.addKidsWish = addKidsWish;
        this.getKidsWishes = getKidsWishes;
        this.deleteKidsWish = deleteKidsWish;
    }

    @PostMapping("/add")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<KidsWish> addKidsWish(@RequestBody NewKidsWishDto newKidsWishDto) {
        return ResponseEntity.ok(addKidsWish.execute(newKidsWishDto));
    }

    @GetMapping("/all")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<List<KidsWish>> getKidsWishes() {
        return ResponseEntity.ok(getKidsWishes.execute());
    }

    @DeleteMapping("/delete")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<Void> deleteKidsWishById(@RequestParam Long wishId) {
        deleteKidsWish.execute(wishId);
        return ResponseEntity.ok().build();
    }
}
