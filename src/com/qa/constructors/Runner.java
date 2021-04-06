package com.qa.constructors;

public class Runner {

	public static void main(String[] args) {
	
//		DataType referenceVariable = new DataType(); 
		
		Abc example; 
		example = new Abc(); 
		
		Abc anotherExample; 
		anotherExample = new Abc(); 
		
		example.balance = 50;
		System.out.println(example.balance);
		
		anotherExample.balance = 100; 
		System.out.println(anotherExample.balance);
		
		example = anotherExample; 
		System.out.println(example.balance);
		
		
		
		
		
	}
}
