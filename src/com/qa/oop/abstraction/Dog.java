package com.qa.oop.abstraction;

public class Dog extends Animal {

	@Override
	public void speak() {
		System.out.println("Woooof");
	}
	

	@Override
	public void eat() {
		System.out.println("I don't want to");
	}
	
	public void walkies() {
		System.out.println("Going for a stroll");
	}
	
	

}
