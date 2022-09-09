package com.qa.test;

public class ReverseString {

	public static void main(String[] args) {
		
		// using for loop

   String s= "rahul";//6
   int len=s.length();
   String rev="";
   for(int i=len-1;i>=0; i--) {
	 rev=rev+  s.charAt(i);
	 // System.out.println(rev);
	   
   }
   System.out.println(rev);

	}
}


 