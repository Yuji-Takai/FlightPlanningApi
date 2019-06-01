package com.ytakai.flightplannerapi.api.rate.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class Rate {
    @Id
    private String id;
    private Integer oneStar;
    private Integer twoStar;
    private Integer threeStar;
    private Integer fourStar;
    private Integer fiveStar;
    private Double average;

    public Rate(String id, Integer oneStar, Integer twoStar, Integer threeStar, Integer fourStar, Integer fiveStar) {
        this.id = id;
        this.oneStar = oneStar;
        this.twoStar = twoStar;
        this.threeStar = threeStar;
        this.fourStar = fourStar;
        this.fiveStar = fiveStar;
        setAverage();
    }

    public void setAverage() {
        this.average = (double) (this.oneStar + this.twoStar * 2 + this.threeStar * 3 + this.fourStar * 4 + this.fiveStar * 5)
                / (double) (this.oneStar + this.twoStar + this.threeStar + this.fourStar + this.fiveStar);
    }

}
