package pl.marcin.zubrzycki.xmaslotteryv3.domain.kidswish;

import javax.persistence.*;

@Entity
@Table(name = "KIDS_WISH")
public class KidsWish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "KID_NAME")
    private String kidName;

    @Column(name = "WISH")
    private String wish;

    public KidsWish(String kidName, String wish) {
        this.kidName = kidName;
        this.wish = wish;
    }

    public KidsWish() {}

    public Long getId() {
        return id;
    }

    public String getKidName() {
        return kidName;
    }

    public String getWish() {
        return wish;
    }
}
