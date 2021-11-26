package com.flightBooking.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FlightDto {

	private int id;
     
	private String name;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime departuretime;
	
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime arrivaltime;
	
	@Range(max = 300)
	private int totalSeats;
	
	private int availableSeats;
	
	private String airline;
	private String source;
	private String destination;
	private double price;

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDateTime getDeparturetime() {
		return departuretime;
	}


	public void setDeparturetime(LocalDateTime departuretime) {
		this.departuretime = departuretime;
	}


	public LocalDateTime getArrivaltime() {
		return arrivaltime;
	}


	public void setArrivaltime(LocalDateTime arrivaltime) {
		this.arrivaltime = arrivaltime;
	}


	public int getTotalSeats() {
		return totalSeats;
	}


	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}


	public int getAvailableSeats() {
		return availableSeats;
	}


	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}


	public String getAirline() {
		return airline;
	}


	public void setAirline(String airline) {
		this.airline = airline;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public FlightDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
