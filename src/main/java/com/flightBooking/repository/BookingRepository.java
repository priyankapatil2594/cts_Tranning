package com.flightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightBooking.entity.Booking;


public interface BookingRepository extends JpaRepository<Booking, Integer> {
	
	
	

}
