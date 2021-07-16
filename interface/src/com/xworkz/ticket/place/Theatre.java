package com.xworkz.ticket.place;

import com.xworkz.ticket.system.TicketSystem;

public class Theatre {

	private TicketSystem ticket;

	public Theatre() {
		System.out.println("Created Theatre ");
	}

	public void bookSeat(int totalTickets) {

		if (totalTickets <= TicketSystem.TOTAL_TICKETS) {
			System.out.println("Number of tickets booked : " + totalTickets);
		} else {
			System.out.println("Tickets not booked");
		}

	}

	public void cancelTickets(int tickets) {

		if (tickets == TicketSystem.TOTAL_TICKETS) {
			System.out.println("Number of tickets cancelled : " + tickets);
		}
	}

	public void setSystem(TicketSystem ticket) {
		this.ticket = ticket;
	}

}
