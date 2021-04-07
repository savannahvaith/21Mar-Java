package com.qa.oop.abstraction;

public abstract class Animal {
	
	// no details for the method!
	abstract public void speak(); 
	abstract public void eat(); 

	public void hungry() {
		System.out.println("I am hungry");
	}

	public void walkies() {
		System.out.println("This is in the animal class");
	}
}
