package io.github.kegeke.weather.test;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ServerInfo {
    String server;
    String ip;
    String status;
    double load;
}
