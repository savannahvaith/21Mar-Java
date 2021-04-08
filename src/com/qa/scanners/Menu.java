package com.qa.scanners;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		System.out.println("Hey guys, how's it going? ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = sc.nextLine(); // nextLine() returns a string
		
		System.out.println("Please enter your age: ");
		int age = sc.nextInt(); // this grabs a number 
		sc.nextLine(); // capture my enter key!
		
		System.out.println("Say something interesting: ");
		String fact = sc.nextLine();
		
		System.out.println("Welcome " + name + " You are: " + age + " fact " + fact);
		
	}

}
