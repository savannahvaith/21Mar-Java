package com.qa.strings;

public class Manipulation {

	 // sequence of characters
	public static void main(String[] args) {
		String str = "hello"; 
		
		String strObject = new String("Hello, World");
		
		int length = str.length();
		System.out.println(length);
		
		// concatenation - adding things together
		String firstname = "bob";
		String lastname = "john";
		
		String str1 = "hello";
		System.out.println(str1.concat(firstname).concat(lastname));
		System.out.println(str1 + " " + firstname + " " + lastname);
		
		// converting text to upper/lowercase
		System.out.println(firstname.toUpperCase());
		System.out.println(firstname.toLowerCase());
		
		System.out.println(str1.indexOf("l"));
		System.out.println(str.startsWith("u"));
		
		System.out.println(str.contains("ll"));
		
		// substring - returns a new string that is version of the current
		// start at specific index, and end at a specific index
		// start = inclusive, end = exclusive
		System.out.println(str.substring(1, 3)); // el = 1,2
		
		
		
	}
}
