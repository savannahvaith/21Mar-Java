package com.qa.accessmods.priv;

public class BankAccount {

	//private field = can only be used inside the class!  - safeguarding
	
	private String name; 
	private int accountNumber; 
	private double balance;
	
	public double sortcode; 
	
	// accessing private variables - GET and SET
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
