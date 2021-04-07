package com.qa.oop.inheritance;

public class MathExtra extends Math {
	
	// has add and subtract functionality via inheritance
	
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
	public void add(int a, int b) {
		System.out.println(" I didn't like my parent's implementation.. so this is mine");
	}

}
