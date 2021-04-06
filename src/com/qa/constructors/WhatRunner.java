package com.qa.constructors;

public class WhatRunner {
	public static void main(String[] xyz) {
		What w = new What(); 
		System.out.println(w.a); // 5
		w.go(); 
		System.out.println(w.a); // 100
	}

}
