package io.github.kegeke.weather.parser;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class CurrentCondition {

    private String FeelsLikeC;
    private String FeelsLikeF;
    private String cloudcover;
    private String humidity;
    private String observation_time;
    private String precipInches;
    private String precipMM;
    private String pressure;
    private String pressureInches;
    private String temp_C;
    private String temp_F;
    private String uvIndex;
    private String visibility;
    private String visibilityMiles;
    private String weatherCode;
    private List<WeatherDesc> weatherDesc;
    private List<WeatherIconUrl> weatherIconUrl;
    private String winddir16Point;
    private String winddirDegree;
    private String windspeedKmph;
    private String windspeedMiles;
}
