package com.flightBooking.service;

import com.flightBooking.dto.BookingDto;
import com.flightBooking.dto.FlightDto;
import com.flightBooking.dto.MealDto;
import com.flightBooking.dto.PaymentDto;
import com.flightBooking.dto.UserDto;
import com.flightBooking.entity.Booking;
import com.flightBooking.entity.Flight;
import com.flightBooking.entity.Meal;
import com.flightBooking.entity.Payment;
import com.flightBooking.entity.User;

public class Utility {
	
	public static UserDto UserentityToDto(User entity) {
		UserDto dto= new UserDto();
		dto.setAge(entity.getAge());
		dto.setId(entity.getId());
		dto.setEmailId(entity.getEmailId());
		dto.setGender(entity.getGender());
		dto.setName(entity.getName());
		dto.setPassword(entity.getPassword());
		dto.setRole(entity.getRole());
	    return dto;	
	}

	
	public static User UserDtotoentity(UserDto dto) {
		User entity= new User();
		  entity.setId(dto.getId());
		  entity.setName(dto.getName());
	      entity.setAge(dto.getAge());
		  entity.setEmailId(dto.getEmailId());
		  entity.setPassword(dto.getPassword());
		  entity.setGender(dto.getGender());
		  entity.setRole(dto.getRole());
		   return entity;	
	}


	
	public static BookingDto BookingentityToDto(Booking entity) {
		 BookingDto dto=new BookingDto();
		 
		 
		 return dto;
		 }
	
	public static Booking BookingeDtoToentity(BookingDto dto) {
		 Booking entity=new Booking();
		 
		 
		 
		 return entity;
	 }
	
	public static FlightDto FlightentityToDto(Flight entity) {
		FlightDto dto=new FlightDto();
		dto.setAirline(entity.getAirline());
		dto.setArrivaltime(entity.getArrivaltime());
		dto.setDeparturetime(entity.getDeparturetime());
		dto.setDestination(entity.getDestination());
		dto.setSource(entity.getSource());
		dto.setName(entity.getName());
		dto.setTotalSeats(entity.getTotalSeats());
		dto.setAvailableSeats(entity.getAvailableSeats());
		dto.setPrice(entity.getPrice());
		dto.setId(entity.getId());
		return dto;
}
	
	public static Flight FlightDtoToentity(FlightDto dto) {
		Flight entity=new Flight();
		entity.setAirline(dto.getAirline());
		entity.setArrivaltime(dto.getArrivaltime());
		entity.setDeparturetime(dto.getDeparturetime());
		entity.setDestination(dto.getDestination());
		entity.setSource(dto.getSource());
		entity.setName(dto.getName());
		entity.setTotalSeats(dto.getTotalSeats());
		entity.setAvailableSeats(dto.getAvailableSeats());
		entity.setPrice(dto.getPrice());
		return entity;
}
	
	

	
	public static MealDto MealentityToDto(Meal entity) {
		int mealId=entity.getMealId();
		String mealType=entity.getMealType();
		double price=entity.getPrice();
		 MealDto dto= new MealDto();
		 return dto;
		}
	
	public static Meal MealDtoToentity(MealDto dto) {
		int mealId=dto.getMealId();
		String mealType=dto.getMealType();
		double price=dto.getPrice();
		Meal entity= new Meal();
		 return entity;
	}
	
	public static PaymentDto PaymententityToDto(Payment entity) {
		int transactiontid=entity.getTransactiontid();
		double amount=entity.getAmount();
		Booking bookingid=entity.getBookingid();
		 PaymentDto dto= new PaymentDto();
		 return dto;
		}
	
	public static Payment PaymentDtoToentity(PaymentDto dto) {
		int transactiontid=dto.getTransactiontid();
		double amount=dto.getAmount();
		Booking bookingid=dto.getBookingid();
		Payment entity= new Payment();
		 return entity;
	}
	
	
}	
	
	
	
	
	
	
	
	
	
	
	