package com.qa.test;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString="MOM";
		StringBuffer buffer = new StringBuffer(myString);
		buffer.reverse();
		String data =buffer.toString();
		if(myString.equals(data)) {
			System.out.println("Yes Pallindrome");
			
		}
		else {
			System.out.println("No Pallindrome");
		}
	}
}
		

