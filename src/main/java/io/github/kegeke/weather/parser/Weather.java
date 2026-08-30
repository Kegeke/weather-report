package io.github.kegeke.weather.parser;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Weather {

    private List<Astronomy> astronomy;
    private String avgtempC;
    private String avgtempF;
    private String date;
    private String maxtempC;
    private String maxtempF;
    private String mintempC;
    private String mintempF;
    private String sunHour;
    private String totalSnow_cm;
    private String uvIndex;
}
