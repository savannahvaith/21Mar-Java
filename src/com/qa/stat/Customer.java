package com.qa.stat;

public class Customer {

	public String name; 
	
	private static int numberOfPeople;
	
	public static void setNumberOfPeople(int numPeople){
		Customer.numberOfPeople = numPeople;
	}
	
	
}
