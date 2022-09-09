package com.qa.test;

public class SplitFunction {

	public static void main(String[] args) {
		
		String Str="Rahul:is:my:name:please:call:me:later:for:queries";
		String s[]=Str.split(":", 10);
		for(String str1:s ) {
			System.out.println(str1);
		}
	}

}
