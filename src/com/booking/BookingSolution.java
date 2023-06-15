package com.booking;

import java.util.Scanner;

public class BookingSolution {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	BusTicketBooking btb=new BookingImpl(100);
	
	while(true) {
		System.out.println("1: Book Ticket:\n2: Cancel Ticket");
		System.out.println("3: Check available tickets:\n4:Exit ");
		System.out.println("Enter Choice :");
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter the tickets to be booked :");
			int ticketToBook=scan.nextInt();
			btb.bookTicket(ticketToBook);
			break;
			
		case 2:
			System.out.println("Enter the tickets to be cancelled :");
			int ticketToCancel=scan.nextInt();
			btb.bookTicket(ticketToCancel);
			break;
			
		case 3:
			System.out.println("Available tickets :"+btb.getTicket());
			break;
			
		case 4:
			System.out.println("ThankYou");
			System.exit(0);
		}
	}
}
}
