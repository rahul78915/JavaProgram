package com.qa.test;

public class ArmstrongNumber {
	
	public static void GetArmstrongNumber(int num) {
		int cube=0;
		int r;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
			
			
		}
		if(t==cube) {
			System.out.println("Yes the number is armstrong");
		}
		else {
			System.out.println("No  the number is not  armstrong");
			
		}
		
	}

	public static void main(String[] args) {
		GetArmstrongNumber(153);



	}

}
