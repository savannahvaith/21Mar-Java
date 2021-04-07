package com.qa.accessmods.priv;

public class BankRunner {
	
	public static void main(String[] args) {
		BankAccount hsbc = new BankAccount(); 
		// hsbc.accountBalance = 15000; = very bad!!!
		hsbc.setName("Savannah");
		hsbc.getName();
		
	}

}
