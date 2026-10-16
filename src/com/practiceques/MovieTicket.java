package com.practiceques;

public class MovieTicket {

	String movieName;
	String seatNumber;
	double ticketPrice;

	MovieTicket(String movieName, String seatNumber, double ticketPrice) {
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.ticketPrice = ticketPrice;
	}

	void displayTicket() {
		System.out.println("Movie: " + movieName);
		System.out.println("Seat: " + seatNumber);
		System.out.println("Price: Rs. " + ticketPrice);
	}
}
