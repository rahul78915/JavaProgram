package com.qa.test;

public class PallindromeNumber {
	//151 161

	public static void main(String[] args) {
		
		isPallindromeNum(151);
	}
	
	public static void isPallindromeNum(int num) {
		int r=0;
		int sum=0;
		int t;
		
		t=sum;
		
		while(num>0) {
			r=num%10; // get the reminder
			sum=(sum*10)+r;
			num=num/10;
		}
		if(t==sum) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}
	}

}
