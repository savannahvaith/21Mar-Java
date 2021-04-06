package com.qa.constructors;

public class CustomerRunner {

	public static void main(String[] args) {
		Customer c = new Customer("Savannah","123 abc Road");
		c.printName();
		
		Customer c2 = new Customer("Bob","123 abc Road"); 
		c2.printName();
		
		Customer c3 = new Customer("Sherbert","123 abc Road"); 
		c3.printName();
	}
}
