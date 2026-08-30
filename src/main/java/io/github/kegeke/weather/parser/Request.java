package io.github.kegeke.weather.parser;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request {

    private String query;
    private String type;
}
