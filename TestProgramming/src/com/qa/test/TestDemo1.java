package com.qa.test;

public class TestDemo1 {
	
	
	int age;
	static {
		TestDemo1 td = new TestDemo1();
		
	}
	public static int  CreateObj() {
		TestDemo1 td = new TestDemo1();
		td.age=40;
		return td.age;
		
	}
	
	private TestDemo1() {
		age=30;
	}
	

	public static void main(String[] args) {
		TestDemo1 td = new TestDemo1();
		System.out.println(td.age);
		

	}

}
