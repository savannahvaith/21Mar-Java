package com.qa.exercises.coins;

public class CoinRunner {

	public static void main(String[] args) {
		Coins c = new Coins(); 
		System.out.println(c.calculateChange(6, 20));
	}
}
