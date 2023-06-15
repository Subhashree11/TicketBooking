package com.booking;

public class BookingImpl implements BusTicketBooking {
	private int totalTicket;
	
	BookingImpl(int totalTIcket){
		this.totalTicket=totalTicket;
	}
	@Override
	public void bookTicket(int tickets) {
		//System.out.println("Booking Tickets :"+totalTicket);
		totalTicket=totalTicket-tickets;
		System.out.println(tickets+ ": Ticket Booking Successfull");
	}
	@Override
	public void cancelTicket(int ticket) {
		if(ticket >= totalTicket) {
		System.out.println("Cancelling Tickets :"+totalTicket);
		totalTicket=totalTicket+ticket;
		System.out.println("Ticket Cancelled Successfully");
	}
		else {
			
			try {
				throw new InsufficientTicketException("Tickets Not Available");
			}
			catch(Exception e) {	
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public int getTicket() {
		return totalTicket;
	}
	@Override
	public String displayErrorMessage() {
		// TODO Auto-generated method stub
		return "Invalid choice,Kindly enter valid choice!";
	}
}