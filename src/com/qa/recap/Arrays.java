package com.qa.recap;

public class Arrays {
	
	static String[] names = { "Harry Pawter", "Jimmy Choo", "Bark Wahlberg"};
	
	
	// Create a method that takes in an array as argument, and prints out each value
	public static void printNames(){
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
	
	public static void enhancedPrintNames() {
		for(String human : names) {
			System.out.println(human);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(names[1]);
		printNames();
		System.out.println("-----------------------");
		enhancedPrintNames();
	}
	

}
