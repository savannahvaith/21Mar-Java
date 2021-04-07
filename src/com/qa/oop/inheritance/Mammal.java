package com.qa.oop.inheritance;

public class Mammal extends Animal{

	private boolean hasFur; 
	private int numberOfLegs; 
	private int speed; 
	private boolean warmBlood; 
	
	public Mammal(int speed) {
		this.speed = speed; 
	}
	
	public Mammal(int speed, int numberOfLegs, boolean hasFur) {
		this.speed = speed; 
		this.numberOfLegs = numberOfLegs; 
		this.hasFur = hasFur;
		this.warmBlood = true; 
	}
	
	public void zoom() {
		System.out.println("look at how fast i can move..." + this.speed);
	}

}
