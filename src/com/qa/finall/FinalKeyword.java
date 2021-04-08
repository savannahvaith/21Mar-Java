package com.qa.finall;

public final class FinalKeyword {
	
	// this is done I cannot change it after it's been set!!!
	private static final int VALUE = 50;

	public int getVALUE() {
		return VALUE;
	} 
	
	public final void method() {
		System.out.println("JAVA IS AWESOME");
	}

}
