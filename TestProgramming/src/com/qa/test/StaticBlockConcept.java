package com.qa.test;

public class StaticBlockConcept {
	
	static {
		System.out.println("Static block");// called when load the class or called automatically
	}

	public static void method() { //explicitly called 
		System.out.println("Static method");
		
	}
	public static void main(String[] args) {// call by the jvm
		// TODO Auto-generated method stub
		System.out.println("main block");
		method();
		StaticBlockConcept.method();
	}

}
