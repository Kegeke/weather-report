package io.github.kegeke.weather.bot;


import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class WeatherBot extends TelegramLongPollingBot {

    private final String botName;

    public WeatherBot(String botName, String botToken) {
        super(botToken);
        this.botName = botName;
    }

    @Override
    public String getBotUsername() {
        return this.botName;
    }

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            long chatId = update.getMessage().getChatId();
            String textFromUser = update.getMessage().getText();

            SendMessage message = new SendMessage();
            message.setChatId(String.valueOf(chatId));
            message.setText("Вы написали: " + textFromUser);

            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
