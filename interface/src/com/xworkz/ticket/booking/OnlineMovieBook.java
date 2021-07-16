package com.xworkz.ticket.booking;

import com.xworkz.ticket.system.TicketSystem;

public class OnlineMovieBook implements TicketSystem {

	@Override
	public boolean book(int totalTickets) {
		System.out.println("Tickets have been booked");
		return true;
	}

	@Override
	public boolean cancel(int tickets) {
		System.out.println("Cancel the ticket");
		return true;
	}

}
