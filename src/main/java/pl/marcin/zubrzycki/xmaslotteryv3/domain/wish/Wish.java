package pl.marcin.zubrzycki.xmaslotteryv3.domain.wish;

import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;

import javax.persistence.*;

@Entity
@Table(name = "WISH")
public class Wish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @Column(name = "NAME")
    private String name;

    public Wish(User user, String name) {
        this.user = user;
        this.name = name;
    }
}
