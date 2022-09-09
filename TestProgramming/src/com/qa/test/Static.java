package com.qa.test;

public class Static {
	
	
	static {
		System.out.println("Hi"); //moment when load the class
	}
	
	public static void staticmethod() {
		System.out.println("Hi static method1");//explicity call
	}
	
	public static void CoverMethod() {
		System.out.println("Hi Cover method1");//explicity call
		staticmethod();
	}

	public static void main(String[] args) {
		System.out.println("Hi static method"); // JVM
		staticmethod();
		Static.staticmethod();
		CoverMethod();
		

	}

}
