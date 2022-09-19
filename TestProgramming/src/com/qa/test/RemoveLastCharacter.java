package com.qa.test;

public class RemoveLastCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java is my fav languages";
		//create the instance of String Buffer
		StringBuffer sb = new StringBuffer(str);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);

	}

}
