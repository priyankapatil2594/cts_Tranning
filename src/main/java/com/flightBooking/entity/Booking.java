package com.flightBooking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@NotEmpty
	private int bookingid;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	@NotNull
	@NotEmpty
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "flightId")
	@NotNull
	@NotEmpty
	private Flight flight;
	
	

	private int noOfSeats;
	
	

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
