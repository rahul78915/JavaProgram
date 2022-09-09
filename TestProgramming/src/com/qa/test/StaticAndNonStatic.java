package com.qa.test;

public class StaticAndNonStatic {
	
	String name="Rahul";
    static  int age =10;

	public static void main(String[] args) {
		sum();
		StaticAndNonStatic st = new StaticAndNonStatic ();
		st.SenMail();
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
      
	}
      
      public void SenMail() {
    	  System.out.println("This is non Static Method");
    	  
      }
      public static void sum() {
    	  System.out.println("This is  Static Method");
    	  
		

	}

}
