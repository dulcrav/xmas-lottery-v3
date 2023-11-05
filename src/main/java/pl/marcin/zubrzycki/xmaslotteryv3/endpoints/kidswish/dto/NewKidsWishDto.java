package pl.marcin.zubrzycki.xmaslotteryv3.endpoints.kidswish.dto;

public class NewKidsWishDto {
    private String kidName;
    private String wish;

    public NewKidsWishDto(String kidName, String wish) {
        this.kidName = kidName;
        this.wish = wish;
    }

    public String getKidName() {
        return kidName;
    }

    public String getWish() {
        return wish;
    }
}
