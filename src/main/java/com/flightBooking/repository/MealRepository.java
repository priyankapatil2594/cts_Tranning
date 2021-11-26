package com.flightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightBooking.entity.Meal;

public interface MealRepository extends JpaRepository<Meal, Integer> {
	
	
	

}
