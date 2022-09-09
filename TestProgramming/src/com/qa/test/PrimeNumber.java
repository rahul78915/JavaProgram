package com.qa.test;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(GetPrimeNumber(2));
  //2 is the prime number
		
		
		

	}
	
	public static boolean GetPrimeNumber(int num) {
		// Edge corner case:
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<num;i++) {
			if(num %i==0){
				return false;
				
			}
		}
			return true;
		}
		

	}


