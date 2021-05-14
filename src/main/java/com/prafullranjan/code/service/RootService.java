package com.prafullranjan.code.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prafullranjan.code.config.AppConfig;
import com.prafullranjan.code.model.MessageModel;

/**
 * Main class to run the application
 * 
 * @author Prafull
 */
public class RootService {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		MessageModel statusBean = context.getBean(MessageModel.class);
		statusBean.setMessage("Be Private!!");
		statusBean.getMessage();
		((ConfigurableApplicationContext) context).close();
	}
}
