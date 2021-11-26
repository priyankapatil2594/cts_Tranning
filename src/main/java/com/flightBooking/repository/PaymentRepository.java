package com.flightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightBooking.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	
	
	

}
