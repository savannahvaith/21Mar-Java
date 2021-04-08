package com.qa.exercises.garage;

public class Boat extends Vehicle{

	private String propellarType; 
	
	public Boat(int noOfWheels, String gears, int topSpeed, String propellarType) {
		super(noOfWheels, gears, topSpeed);
		this.propellarType = propellarType;
		
	}

	public String getPropellarType() {
		return propellarType;
	}

	public void setPropellarType(String propellarType) {
		this.propellarType = propellarType;
	}

	@Override
	public float calculateBill() {
		return 1*getTopSpeed();
	}
	
	
	
}
