package com.qa.test;

public class StaticFinal {

	public static void main(String[] args) {
	
		System.out.println(Test.x);

	}

}


//If we put the final keyword then it will not load the Test class and it will take directly the value of x. 
// And if we remove the final keyword then it load the Test Class

 class Test{
	 
	 public static final int x =100;
	 static{
		 System.out.println("This is static block :-------");
		 {
	 }
		 
	
}
 }