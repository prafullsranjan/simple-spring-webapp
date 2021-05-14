package com.prafullranjan.code.model;

/**
 * This is a model class for message
 * 
 * @author Prafull
 */
public class MessageModel {

	private String message;

	/**
	 * Gets message message
	 * 
	 * @return the message message
	 */
	public void getMessage() {
		System.out.println("Hey, your message is: " + message);
	}

	/**
	 * Sets message message
	 * 
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
