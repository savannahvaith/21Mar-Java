package com.qa.oop.interfaces;

public class Pig extends Animal implements Mammal{

	@Override
	public void speak() {
		System.out.println("oink oink");
		
	}

	@Override
	public void sleep() {
		System.out.println("zzzzzz");
		
	}

}
