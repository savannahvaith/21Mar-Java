package com.qa.oop.polymorphism;

public class Runner {
	
	public static void main(String[] args) {
		
		Cow cow = new Cow();  // speak,sleep
		Animal animal = new Cow(); // sleep
		Object object = new Cow(); // only let me use object methods
		
		System.out.println("-------cow--------");
		cow.sleep();
		cow.speak();
		
		System.out.println("---------- animal --------");
		animal.sleep();
		((Cow) animal).speak();
		
		System.out.println("-------object---------");
		((Cow) object).sleep(); // animal class
		((Cow) object).speak(); // cow class
		
	}

}
