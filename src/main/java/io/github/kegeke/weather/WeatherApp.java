package io.github.kegeke.weather;

import io.github.kegeke.weather.model.WeatherResponse;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherApp {

    static final String URL = "https://wttr.in/";
    static final String CITY = "Novosibirsk";

    static void main() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL + CITY + "?format=j2"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper objectMapper = new ObjectMapper();
        WeatherResponse weatherResponse = objectMapper.readValue(response.body(), WeatherResponse.class);
        System.out.println(weatherResponse.getCurrentCondition().getFirst());
    }
}
