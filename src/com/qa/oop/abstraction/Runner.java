package com.qa.oop.abstraction;

public class Runner {

	public static void main(String[] args) {
		Elephant dumbo = new Elephant(); 
		System.out.println("----- dumbo the elephant --------");
		dumbo.eat();
		dumbo.hungry();
		dumbo.speak();
		dumbo.walkies();
		
		Dog milo = new Dog();
		System.out.println("-------- milo the dog -------");
		milo.eat();
		milo.speak();
		milo.walkies();
		
		// we cannot make an instance of an ABSTRACT class
//		Animal a = new Animal();
		Animal a = new Dog(); 
		
	}
}
