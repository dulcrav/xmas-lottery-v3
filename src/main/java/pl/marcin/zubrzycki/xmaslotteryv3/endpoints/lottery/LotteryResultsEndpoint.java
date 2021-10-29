package pl.marcin.zubrzycki.xmaslotteryv3.endpoints.lottery;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.lottery.LotteryResults;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.lottery.ClearLots;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.lottery.DrawLots;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.lottery.GetLotByPlayer;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.lottery.GetLots;

import java.util.Collection;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/xmas/api/lottery")
public class LotteryResultsEndpoint {
    private final GetLots getLots;
    private final DrawLots drawLots;
    private final GetLotByPlayer getLotByPlayer;

    public LotteryResultsEndpoint(GetLots getLots, DrawLots drawLots, GetLotByPlayer getLotByPlayer) {
        this.getLots = getLots;
        this.drawLots = drawLots;
        this.getLotByPlayer = getLotByPlayer;
    }

    @PostMapping
    public ResponseEntity<Collection<LotteryResults>> draw() {
        return ResponseEntity.ok(drawLots.execute());
    }

    @GetMapping
    public ResponseEntity<Collection<LotteryResults>> getResult() {
        return ResponseEntity.ok(getLots.execute());
    }

    @GetMapping("/result")
    public ResponseEntity<LotteryResults> getResultForPlayer(@RequestParam Long id) {
        return ResponseEntity.ok(getLotByPlayer.execute(id));
    }

}
