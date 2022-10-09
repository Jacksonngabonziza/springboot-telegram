package com.example.demo;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class GbvBot extends TelegramLongPollingBot {
    @Override
public void onUpdateReceived(Update update) {
    // We check if the update has a message and the message has text
    if (update.hasMessage() && update.getMessage().hasText()) {
        SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
        message.setChatId(update.getMessage().getChatId().toString());
        message.setText("welcome to GBV chatbot,am not yet able to answer all you questions but soon i will");
        
        try {
            execute(message); // Call method to send the message
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}


    @Override
    public String getBotUsername() {
        return "gbvussd_bot";
    }

    @Override
    public String getBotToken() {
        // TODO
            return "5792819703:AAHgAkCCJqOzS2a0pGqWrLawdtokbsk5a1g";
    }


 }