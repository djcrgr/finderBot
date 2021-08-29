package com.djcrgr.demo.bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class DemoBotApplication {

	public static void main(String[] args) throws TelegramApiException {
		SpringApplication.run(DemoBotApplication.class, args);
	}

}
