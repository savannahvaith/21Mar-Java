package com.qa.exercises.garage;

public abstract class Vehicle {
	
	private int noOfWheels; 
	private String gears; 
	private int topSpeed;
	
	// constructor for vehicle class
	public Vehicle(int noOfWheels, String gears, int topSpeed) {
		super(); // refering to object class
		this.noOfWheels = noOfWheels;
		this.gears = gears;
		this.topSpeed = topSpeed;
	}
	
	// Abstract method which all child classes need to implement
	public abstract float calculateBill(); 

	// Methods to access data members - GETTERS & SETTERS

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getGears() {
		return gears;
	}

	public void setGears(String gears) {
		this.gears = gears;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}


	// toString Override
	@Override
	public String toString() {
		return "Vehicle [noOfWheels=" + noOfWheels + ", gears=" + gears + ", topSpeed=" + topSpeed + "]";
	} 
	
	
	
	
	

}
