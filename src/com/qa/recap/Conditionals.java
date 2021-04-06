package com.qa.recap;

public class Conditionals {
	
	static boolean sufficientFunds = true;
	
	// if there is sufficientfunds - print "you have enough to withdraw" 
	// else, "Soz, you don't have enough money"
	
	public static void checkCanWithdraw() {
		if(sufficientFunds) {
			System.out.println("You have enough to withdraw");
		}else {
			System.out.println("Sorry, you don't have enough money");
		}
	}
	
	public static void changeToInsufficient() {
		sufficientFunds = false; 
	}
	
	public static void main(String[] args) {
		checkCanWithdraw();
		changeToInsufficient(); 
		checkCanWithdraw();
	}
	

}
