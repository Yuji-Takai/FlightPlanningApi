package com.ytakai.flightplannerapi.api.airport.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Airport {
    @Id
    private String iata;
    private Coordinate coordinate;
    private String country;
    private String city;
    private Boolean isHub;
    private Boolean isInternational;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Coordinate {
        private Double longitude;
        private Double latitude;
    }
}
