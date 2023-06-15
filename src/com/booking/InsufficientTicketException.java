package com.booking;

public class InsufficientTicketException extends Exception {
	private String message;
	
	public InsufficientTicketException(String message){
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
}
