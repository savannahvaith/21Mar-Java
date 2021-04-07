package com.qa.oop.encapsulation;

public class Runner {

	public static void main(String[] args) {
		
		Mouse juliusCheeser = new Mouse(); 
		
		System.out.println(juliusCheeser.getBelly()); // empty
		juliusCheeser.setBelly("consuming");
		System.out.println(juliusCheeser.getBelly()); // consuming
		juliusCheeser.eat();
		System.out.println(juliusCheeser.getBelly()); // stuffed
		
		
		
	}
	
	
}
