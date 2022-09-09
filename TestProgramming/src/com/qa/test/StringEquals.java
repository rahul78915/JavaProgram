package com.qa.test;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1="Rahul";
		String S2="Rahul";
		String S3="Rahul";
		String S4 = new String("Rahul");
		
		System.out.println(S1==S2);
		System.out.println(S2.equals(S3));
		System.out.println(S1.equals(S4));

	}

}
