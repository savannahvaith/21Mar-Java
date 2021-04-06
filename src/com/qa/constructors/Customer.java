package com.qa.constructors;

public class Customer {
	
	// name, address, number
	private String name; 
	private String address; 
	private String number;

	public Customer() {}
	
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public Customer(String name, String address, String number) {
		this.name = name; 
		this.address = address;
		this.number = number ; 
	}
	
	public void printName() {
		System.out.println("The customers name is: " + this.name);
	}
	
	
	
}
