package io.github.kegeke.weather.config;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BotConfig {

    private static final Properties properties = new Properties();

    static {
        try (InputStream input = BotConfig.class.getClassLoader()
                .getResourceAsStream("config.properties")) {
            if (input == null) {
                throw new RuntimeException("config.properties not found in resources");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config ", e);
        }
    }

    public static String getToken() {
        return properties.getProperty("bot.token");
    }

    public static String getUsername() {
        return properties.getProperty("bot.username");
    }
}
