package com.flightBooking.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.flightBooking.entity.Booking;

public class PaymentDto {
	
	
	private int transactiontid;
	
	@NotNull
	@NotEmpty
	private double amount;
	
	@JsonManagedReference
	private Booking bookingid;
	



	public int getTransactiontid() {
		return transactiontid;
	}


	public void setTransactiontid(int transactiontid) {
		this.transactiontid = transactiontid;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Booking getBookingid() {
		return bookingid;
	}


	public void setBookingid(Booking bookingid) {
		this.bookingid = bookingid;
	}
	


	public PaymentDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	

}
