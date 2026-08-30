package io.github.kegeke.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.kegeke.weather.parser.CurrentCondition;
import io.github.kegeke.weather.parser.NearestArea;
import io.github.kegeke.weather.parser.Request;
import io.github.kegeke.weather.parser.Weather;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tools.jackson.databind.ObjectMapper;

import java.net.http.HttpResponse;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class WeatherResponse {

    @JsonProperty("current_condition")
    private List<CurrentCondition> currentCondition;

    @JsonProperty("nearest_area")
    private List<NearestArea> nearestArea;

    @JsonProperty("requests")
    private List<Request> requests;

    @JsonProperty("weathers")
    private List<Weather> weathers;

}
