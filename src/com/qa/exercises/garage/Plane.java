package com.qa.exercises.garage;

public class Plane extends Vehicle{
	

	private int noOfWings; 
	
	public Plane(int noOfWheels, String gears, int topSpeed, int noOfWings) {
		super(noOfWheels, gears, topSpeed);
		this.noOfWings = noOfWings;
	}

	public int getNoOfWings() {
		return noOfWings;
	}

	public void setNoOfWings(int noOfWings) {
		this.noOfWings = noOfWings;
	}

	@Override
	public float calculateBill() {
		return noOfWings * 50; 
	}	
	
}
