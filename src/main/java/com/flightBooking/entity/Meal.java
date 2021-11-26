package com.flightBooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Meal  {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mealId;
	
	
	private String mealType;
	
	@Column(precision = 2)
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

	
	public Meal() {
		super();
		// TODO Auto-generated constructor stub
	
	
}

}