package com.qa.oop.inheritance;

public class Dog extends Mammal{

	private String species; 
	
	public Dog(int speed, int numberOfLegs, boolean hasFur) {
		super(speed, numberOfLegs, hasFur);
	}
	
	public Dog(int speed, int numberOfLegs, boolean hasFur, String species) {
		super(speed, numberOfLegs, hasFur);
		this.species = species;
	}
	

	public void speak() {
		System.out.println("Woooof");
	}
	
	
}
