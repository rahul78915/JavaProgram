package com.qa.test;

public class StringCapatilization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "MyNameIsRahulPrakash";
		
		int count =0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)>= 'A' && str.charAt(i)<='Z') {
			count++;
			
			
		}
	}
	
	System.out.println(count);
	
	int count1=0;
	for(int i =0;i<str.length();i++) {
		if(Character.isUpperCase(str.charAt(i))) {
			count1++;
		}
	}
	
	System.out.println(count1);
	
	int count2 =0;
	for(int i =0;i<str.length();i++) {
		count2++;
		
		
	}

	System.out.println(count2);


}
}
