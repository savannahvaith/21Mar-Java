package com.qa.oop.inheritance;

public class Animal {

	private boolean lookingForFood; 
	private String colour; 
	
	public void eat() {
		System.out.println("Yummy");
	}
	
	public void sleep() {
		System.out.println("Catching some zzzzzzz's");
	}

	// getters and setters for my datamembers
	public boolean islookingForFood() {
		return lookingForFood;
	}

	public void setIslookingForFood(boolean lookingForFood) {
		this.lookingForFood = lookingForFood;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
