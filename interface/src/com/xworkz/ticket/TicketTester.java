package com.xworkz.ticket;

import com.xworkz.ticket.booking.OnlineMovieBook;
import com.xworkz.ticket.place.Theatre;
import com.xworkz.ticket.system.TicketSystem;

public class TicketTester {

	public static void main(String[] args) {

		TicketSystem ticket = new OnlineMovieBook();

		Theatre theatre = new Theatre();
		theatre.setSystem(ticket);
		ticket.book(25);
		ticket.cancel(5);
	}

}
