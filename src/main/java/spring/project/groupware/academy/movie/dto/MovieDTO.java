package spring.project.groupware.academy.movie.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieDTO {
    private String text;
    @JsonProperty("boxOfficeResult")
    private BoxOfficeResult boxOfficeResult;

    public BoxOfficeResult getBoxOfficeResult() {
        return boxOfficeResult;
    }

    public void setBoxOfficeResult(BoxOfficeResult boxOfficeResult) {
        this.boxOfficeResult = boxOfficeResult;
    }
}

class BoxOfficeResult {
    @JsonProperty("boxofficeType")
    private String boxofficeType;

    @JsonProperty("showRange")
    private String showRange;

    @JsonProperty("yearWeekTime")
    private String yearWeekTime;

    @JsonProperty("weeklyBoxOfficeList")
    private WeeklyBoxOffice[] weeklyBoxOfficeList;
}

class WeeklyBoxOffice {
    @JsonProperty("rnum")
    private String rnum;

    @JsonProperty("rank")
    private String rank;

    @JsonProperty("rankInten")
    private String rankInten;

    @JsonProperty("rankOldAndNew")
    private String rankOldAndNew;

    @JsonProperty("movieCd")
    private String movieCd;

    @JsonProperty("movieNm")
    private String movieNm;

    @JsonProperty("openDt")
    private String openDt;

    @JsonProperty("salesAmt")
    private String salesAmt;

    @JsonProperty("salesShare")
    private String salesShare;

    @JsonProperty("salesInten")
    private String salesInten;

    @JsonProperty("salesChange")
    private String salesChange;

    @JsonProperty("salesAcc")
    private String salesAcc;

    @JsonProperty("audiCnt")
    private String audiCnt;

    @JsonProperty("audiInten")
    private String audiInten;

    @JsonProperty("audiChange")
    private String audiChange;

    @JsonProperty("audiAcc")
    private String audiAcc;

    @JsonProperty("scrnCnt")
    private String scrnCnt;

    @JsonProperty("showCnt")
    private String showCnt;
}