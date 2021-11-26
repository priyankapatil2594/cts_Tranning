package com.flightBooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightBooking.entity.User;
import com.flightBooking.repository.UserRepository;


@Service
public class Mealservice {

	@Autowired
	UserRepository userRepository;

	public Integer save(User user) {
		Integer userId = userRepository.save(user).getId();
		return userId ;
	}
}
