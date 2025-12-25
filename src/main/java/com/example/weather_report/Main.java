package com.example.weather_report;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {
    public static void main(String[] args) {
        var client = new OkHttpClient();
        // Запрос для Лондона (широта 51.52, долгота -0.11)
        String url = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m,wind_speed_10m";
        Request request = new Request.Builder().url(url).build();

        try (Response response = client.newCall(request).execute()) {
            String jsonData = response.body().string();
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(jsonData);

            double temp = root.path("current").path("temperature_2m").asDouble();
            double wind = root.path("current").path("wind_speed_10m").asDouble();
            System.out.printf("Температура: %.1f°C, Скорость ветра: %.1f км/ч%n", temp, wind);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
