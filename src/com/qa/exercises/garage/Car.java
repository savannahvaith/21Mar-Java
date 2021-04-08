package com.qa.exercises.garage;

public class Car extends Vehicle{
	
	private int bootSpace; 

	public Car(int noOfWheels, String gears, int topSpeed, int bootSpace) {
		super(noOfWheels, gears, topSpeed);
		this.bootSpace = bootSpace;
	}

	public int getBootSpace() {
		return bootSpace;
	}

	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}

	@Override
	public float calculateBill() {
		return bootSpace * 10; 
	}
	

}
