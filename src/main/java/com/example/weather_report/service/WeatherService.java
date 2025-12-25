package com.example.weather_report.service;

import com.example.weather_report.model.Weather;

public interface WeatherService {
    Weather getWeatherByService(String city);
}
