package com.qa.exercises.person;

import java.util.ArrayList;

public class PersonManager {

//	specify the datatype of what you want to store
	private ArrayList<Person> people = new ArrayList<Person>();

	public void addHuman(Person p) {
		this.people.add(p);
	}

	// search a person by their name:
	public void search(String searchName) {
//		for(int i=0; i<people.length; i++)
		for (Person p : people) {
			if (p.getName().equals(searchName)) {
				p.personString();
			} else {
				System.out.println("Sorry, couldn't find you!");
			}
		}
	}

}
