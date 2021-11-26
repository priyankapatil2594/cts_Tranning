package com.flightBooking.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flightBooking.dto.BookingDto;
import com.flightBooking.dto.FlightDto;
import com.flightBooking.service.Bookingservice;
import com.flightBooking.service.Flightservice;

@RestController
public class FlightController {
	
	@Autowired
    private Flightservice service;

	@Autowired
	private Bookingservice bookingService;
	
	@GetMapping(path = "/flight/search")
public List<FlightDto> findAllFlights(){
	return service.findAllFlights();
}

@PostMapping(path = "/airlines")
public Integer saveFlight(@RequestBody FlightDto flight){
	return service.addflight(flight);
}

@PostMapping("/flight/booking/{flightId}")
public Integer bookTicket(@PathVariable("flightId") Integer id,@RequestBody BookingDto booking) {
	return bookingService.bookTicket(id , booking);
}
	
}
