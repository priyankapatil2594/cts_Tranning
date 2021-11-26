package com.flightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightBooking.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight,Integer> {

	
	

////	@Query("select flightId as myflight from flight where source='$source' and destination='$destination'" )
//	@Query("Select id from Flight where source = ?3")
//	public	List<Flight> findFlightBySource(LocalDateTime departuretime,LocalDateTime  arrivaltime, String source,String destination);
////	
	
	

}
