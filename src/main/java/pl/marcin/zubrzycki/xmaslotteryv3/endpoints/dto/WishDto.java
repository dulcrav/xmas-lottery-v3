package pl.marcin.zubrzycki.xmaslotteryv3.endpoints.dto;

public class WishDto {
    private Long userId;
    private String name;

    private WishDto(Long userId, String name) {
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
