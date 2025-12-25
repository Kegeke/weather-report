package com.example.weather_report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherReportController {

    @GetMapping("/")
    public String getWeather() {
        return "weather";
    }
}
