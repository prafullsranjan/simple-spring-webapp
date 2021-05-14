package com.prafullranjan.code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.prafullranjan.code.model.MessageModel;

/**
 * This is the configuration class for this spring app
 * 
 * @author Prafull
 */
@Configuration
public class AppConfig {

	@Bean
	public MessageModel messageModel() {
		return new MessageModel();
	}
}
