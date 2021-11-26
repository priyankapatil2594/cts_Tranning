package com.flightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightBooking.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	

}
