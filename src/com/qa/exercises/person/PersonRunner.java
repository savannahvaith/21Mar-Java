package com.qa.exercises.person;

import java.util.ArrayList;

public class PersonRunner {
	
	public static void main(String[] args) {
		
		Person example1 = new Person("Man fred",25,"Wasteman");
		Person example2 = new Person("Willian",31,"Wingman");
		Person example3 = new Person("Bekky", 25, "Wastewoman");
		
		example2.personString();
		System.out.println(example1);
		
		// Creating a list implementation, and storing objects inside of it
		PersonManager manager = new PersonManager();		
		manager.addHuman(example1);
		manager.addHuman(example2);
		manager.addHuman(example3);
		
		manager.search("Willian");
	}

}
