package com.flightBooking.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.flightBooking.entity.Gender;
import com.flightBooking.entity.Role;

public class UserDto {
	
    int id;
	
	@NotNull
	@NotEmpty
	@Pattern(regexp = "^[a-zA-z]$", message = "name should contain only alphabets")
	private String name;
	
	@Range(min = 1)
	private int age;
	
	@NotNull(message = "email cannot be null")
	private String emailId;
	
	@NotNull
	@NotEmpty
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}[]:;<>,.?/~_+-=|\\]).{8,32}$")
	private String password;
	
	private Gender gender;
	
	private Role role;
	
	@JsonManagedReference
	private List<BookingDto> bookings;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}


   public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
	
	public List<BookingDto> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingDto> bookings) {
		this.bookings = bookings;
	}

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
