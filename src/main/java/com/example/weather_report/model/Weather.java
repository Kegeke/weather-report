package com.example.weather_report.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Weather {
    private String city;
    private Double temperature;
    private Double feelsLike;
    private String description;
    private Double windSpeed;
    private LocalDateTime updateTime;
}
