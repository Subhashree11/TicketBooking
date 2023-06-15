package com.booking;

public interface BusTicketBooking {
	void bookTicket(int ticket);
	void cancelTicket(int ticket);
	int getTicket();
	String displayErrorMessage();
}
