package pl.marcin.zubrzycki.xmaslotteryv3.endpoints.wish.dto;

public class NewWishDto {
    private Long userId;
    private String name;

    private NewWishDto(Long userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
