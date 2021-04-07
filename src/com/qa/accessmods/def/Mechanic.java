package com.qa.accessmods.def;

import com.qa.accessmods.priv.BankAccount;

public class Mechanic {

	Car c = new Car();
	
	public int readExhausts() {
		return c.exhausts; 
	}
	
	public static void main(String[] args) {
		BankAccount bc = new BankAccount(); 
		bc.sortcode = 14000; 
	}

	
}
