package pl.marcin.zubrzycki.xmaslotteryv3.domain.lottery;

import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;

import javax.persistence.*;

@Entity
@Table(name = "LOTTERY_RESULTS")
public class LotteryResults {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User userPlayer;

    @ManyToOne
    private User drawnUser;

    public LotteryResults() {}

    public LotteryResults(User user, User drawnUser) {
        this.userPlayer = user;
        this.drawnUser = drawnUser;
    }

    public User getUser() {
        return userPlayer;
    }

    public User getDrawnUser() {
        return drawnUser;
    }
}
