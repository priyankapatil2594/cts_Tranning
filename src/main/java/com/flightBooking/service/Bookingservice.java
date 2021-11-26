package com.flightBooking.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightBooking.dto.BookingDto;
import com.flightBooking.entity.Booking;
import com.flightBooking.entity.Flight;
import com.flightBooking.repository.BookingRepository;
import com.flightBooking.repository.FlightRepository;


@Service
public class Bookingservice {

	@Autowired
	private BookingRepository bookingRepository;

	private FlightRepository flightRepository;
	
	@Transactional
	public Integer bookTicket(Integer flightId,BookingDto booking) {
		Integer pnrNum=bookingRepository.save(Utility.BookingeDtoToentity(booking)).getBookingid();
		Flight flight = flightRepository.findById(booking.getFlight().getId()).get();
		int seats = flight.getAvailableSeats();
		flight.setAvailableSeats(seats-booking.getNoOfSeats());
		flightRepository.save(flight);
		return pnrNum;
	}

}
