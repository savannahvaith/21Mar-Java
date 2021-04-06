package com.qa.constructors;

public class Customer {
	
	// name, address, number
	private String name; 
	private String address; 
	private String number;

	public Customer() {}
	
	public Customer(String firstName, String street) {
		this.name = firstName;
		this.address = street;
	}
	
	public void printName() {
		System.out.println("The customers name is: " + name);
	}
	
	
	
}
