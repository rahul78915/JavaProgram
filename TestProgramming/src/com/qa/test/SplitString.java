package com.qa.test;

public class SplitString {

	public static void main(String[] args) {

 String S="My:Name:is:rahul:Prakash";
String[] Str= S.split(":", 5);

	

	for(String Str1:Str) {
		System.out.println(Str1);
		
	}
}
}
