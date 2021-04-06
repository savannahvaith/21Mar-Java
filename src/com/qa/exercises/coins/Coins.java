package com.qa.exercises.coins;

public class Coins {

	// money, cost of item
	public String calculateChange(double purchasePrice, double moneyGiven) {
		// calculate the change required;
		double change = 0;
		change = moneyGiven - purchasePrice;
		System.out.println("Your change is: " + change);

		double n20 = 0;
		double n10 = 0;
		double n5 = 0;
		double n2 = 0;
		double n1 = 0;

		if (change >= 20) {
			n20 = (change / 20);
			change = change % 20;
		}
		if (change >= 10) {
			n10 = 1;
			change = change % 10;
		}
		if (change >= 5) {
			n5 = 1;
			change = change % 5;
		}
		if (change >= 2) {
			n2 = change / 2;
			change = change % 2;
		}
		if (change >= 1) {
			n1 = change / 1;
			change %= 1;
			change = change % 1; 
		}
		
		return "Your change is:\n" + n20 +" x £20\n" + n10+ " x £10\n" + n5+ " x £5\n" + n2 + " x £2\n" + n1 + "x1 £1\n";
	}

}
