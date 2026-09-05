package io.github.kegeke.weather.bot;

import io.github.kegeke.weather.config.BotConfig;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class WeatherBotTest {

    static void main() {
        try {
            String botName = BotConfig.getUsername();
            String botToken = BotConfig.getToken();

            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new WeatherBot(botName, botToken));

            System.out.println("Бот успешно запущен!");
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}
