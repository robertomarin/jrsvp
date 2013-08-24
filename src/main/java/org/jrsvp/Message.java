package org.jrsvp;

import javax.validation.Path;

public class Message {

	private String message;

	private String inputField;

	public Message(String message, Path path) {
		this.message = message;
		inputField = path.toString();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getInputField() {
		return inputField;
	}

	public void setInputField(String inputField) {
		this.inputField = inputField;
	}

}
