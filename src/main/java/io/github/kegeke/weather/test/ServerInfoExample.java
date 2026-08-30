package io.github.kegeke.weather.test;

import tools.jackson.databind.ObjectMapper;

import java.io.File;

public class ServerInfoExample {

    static void main() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ServerInfo serverInfo = objectMapper.readValue(
                    new File("src/main/resources/json.json"), ServerInfo.class);
            System.out.println(serverInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
