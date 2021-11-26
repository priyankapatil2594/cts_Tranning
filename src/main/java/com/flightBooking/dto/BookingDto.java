package com.flightBooking.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;


public class BookingDto {
	
	private int bookingid;
	
	@JsonBackReference
	private UserDto user;
	
	@JsonBackReference
	private FlightDto flight;
	
	
	
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


	public UserDto getUser() {
		return user;
	}


	public void setUser(UserDto user) {
		this.user = user;
	}


	public FlightDto getFlight() {
		return flight;
	}


	public void setFlight(FlightDto flight) {
		this.flight = flight;
	}







	public BookingDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
   
	
	

}
