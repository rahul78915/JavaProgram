package com.qa.test;

public class TestDemo {
	
	static {
		System.out.println("Static keyword");
		
	}

	
	public static void GetDemo() {
		System.out.println("Static block");
		PutDemo();
	}
	
	public static void PutDemo() {
		System.out.println("Put block");
	}
	public static void main(String[] args) {
		TestDemo.GetDemo();
		TestDemo.PutDemo();
		// TODO Auto-generated method stub

	}

}
