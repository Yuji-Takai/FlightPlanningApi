package com.ytakai.flightplannerapi.api.flight.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.Duration;
import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    @Id
    private String id;
    private String from;
    private String to;
    private String providerId;
    private ZonedDateTime departureTime;
    private ZonedDateTime arrivalTime;
    private Duration duration;
    private Double distance;
    private Integer capacity;
    private Integer numOfReservations;
}
