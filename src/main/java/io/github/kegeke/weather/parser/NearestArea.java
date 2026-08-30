package io.github.kegeke.weather.parser;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class NearestArea {

    private List<AreaName> areaName;
    private List<Country> country;
    private String latitude;
    private String longitude;
    private String population;
    private List<Region> region;
    private List<WeatherUrl> weatherUrl;
}
