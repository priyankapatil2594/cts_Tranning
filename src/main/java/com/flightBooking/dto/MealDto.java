package com.flightBooking.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class MealDto  {
    
	private int mealId;
	
	
	private String mealType;
	
	@NotNull
	@NotEmpty
	private double price;

	public int getMealId() {
		return mealId;
	}

	public void setMealId(int mealId) {
		this.mealId = mealId;
	}

	public String getMealType() {
		return mealType;
	}

	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public MealDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}