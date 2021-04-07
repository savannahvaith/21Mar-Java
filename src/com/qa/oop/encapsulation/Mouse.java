package com.qa.oop.encapsulation;

public class Mouse {
	
	private String belly = "Empty";

	// to interact with ^ GETTERS & SETTERS
	// right click - source - generate getters & setters - select & confirm
	
	public String getBelly() {
		return belly;
	}

	public void setBelly(String belly) {
		this.belly = belly;
	} 
	
	// methods
	public void eat() {
		belly = "stuffed";
	}
	
	public void empty() {
		belly = "empty";
	}

}
