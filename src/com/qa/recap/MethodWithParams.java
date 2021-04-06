package com.qa.recap;

public class MethodWithParams {

	// Create a method that prints "Hello world"
	public static void helloMethod() {
		System.out.println("Hello World"); 
	}
	
	public static String helloMethodAlt() {
		return "Hello, World";  
	}
	
	// Create a method that prints the message "Hello, {firstname} {lastname}"
	public static void helloPeople(String fname, String sname) {
		 System.out.println("Hello, " + fname + " "+ sname);
	}
}
