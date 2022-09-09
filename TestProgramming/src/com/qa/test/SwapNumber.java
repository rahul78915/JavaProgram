package com.qa.test;

public class SwapNumber {

	public static void main(String[] args) {
		
		int x=5;
		int y=10;
		
		int t;
		// 1.With using third variable:
		
		t=x;
		x=y;
		y=t;
		
		
		System.out.println(x);
		System.out.println(y);
		
		
		//2. Without using third variable
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		

	}

}
