package com.flightBooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transactiontid;
	
	@Column(precision = 2)
	@NotNull
	@NotEmpty
	private double amount;
	
	@OneToOne
	@NotNull
	@NotEmpty
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
	

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

}

