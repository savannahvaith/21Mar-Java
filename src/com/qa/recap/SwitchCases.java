package com.qa.recap;

public class SwitchCases {
	
	// 1,2,3,4,5,6,7,8,9,10,11,12
	public static void printMonth(int month) {
		
		switch (month) {
		case 1 :
			System.out.println("January");
			break; 
		case 2:
			System.out.println("Feburary");
			break; 
		case 3: 
			System.out.println("March");
			break; 
		case 4:
			System.out.println("I don't know ask google");
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			break;
		default:
			System.out.println("I couldn't find what you were looking for");
			break;
		}
	}
	
	public static void main(String[] args) {
		printMonth(13);
	}

}
