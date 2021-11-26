package com.flightBooking.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightBooking.dto.BookingDto;
import com.flightBooking.dto.FlightDto;
import com.flightBooking.entity.Flight;
import com.flightBooking.repository.BookingRepository;
import com.flightBooking.repository.FlightRepository;


@Service
public class Flightservice {

	@Autowired
	FlightRepository flightrepo;
	
	BookingRepository bookingRepository;

	public List<FlightDto> searchByflight(LocalDateTime departuretime,LocalDateTime arrivaltime, String source, String destination) {
//		List<Flight> flights = flightrepo.findFlightBySource(departuretime,arrivaltime, source, destination);
//		System.out.println(flights);
//		List<FlightDto> dtos = flights.stream().map(flight -> Utility.FlightentityToDto(flight)).collect(Collectors.toList());
		return null;
	}

	public List<FlightDto> findAllFlights() {
		return flightrepo.findAll().stream().map(flight -> Utility.FlightentityToDto(flight)).collect(Collectors.toList());
	}

	public Integer addflight(FlightDto flight) {
		return flightrepo.save(Utility.FlightDtoToentity(flight)).getId();
		
	}



}
