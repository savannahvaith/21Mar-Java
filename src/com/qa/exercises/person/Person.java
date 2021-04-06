package com.qa.exercises.person;

public class Person {
	
	// private = safer
	private String name; 
	private int age; 
	private String title; 
	
	// Constructor - Called when we instantiate an object of the class!
	public Person(String name, int age, String title) {
		this.name = name; 
		this.age = age; 
		this.title = title; 
	}
	
	@Override
	public String toString() {
		return String.format("name: %s, age: %d jobtitle: %s", this.name,this.age,this.title);
	}
	
	public void personString() {
		System.out.println("Customer: " + this.name + " is " + this.age + " is a " + this.title);
	}
	
	// getters = a method that returns the value of a datamember
	public String getName() {
		return name;
	}
	

}
