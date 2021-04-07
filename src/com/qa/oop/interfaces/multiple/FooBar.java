package com.qa.oop.interfaces.multiple;

public class FooBar implements InterfaceOne, InterfaceTwo{

	@Override
	public void bar() {
		System.out.println("Something");
	}

	@Override
	public void foo() {
		System.out.println("important");
	}

}
