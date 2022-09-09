package com.qa.test;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s ="*^*^&*%& Rahul is my name7890 ^&^*&%&%&^";
		
		//Regular Expression[^a-zA-Z0-9]
		
	s=	s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s);
		
	}

}
