package com.qa.test;

public class StaticBlockQues1 {
	
	// how can we create an obje if we make constructor as private.
	
	
	int age;
	
	static {
		StaticBlockQues1 ob2 = new StaticBlockQues1();
	}
	public static int staticobj() {
		StaticBlockQues1 ob2 = new StaticBlockQues1();
		ob2.age=40;
		return ob2.age;
	}
	
	private StaticBlockQues1() {
		age=30;
	
	}

	public static void main(String[] args) {
		StaticBlockQues1 stq = new StaticBlockQues1();
		System.out.println(stq.age);
		

	}

}
