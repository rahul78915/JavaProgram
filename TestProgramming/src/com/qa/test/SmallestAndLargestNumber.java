package com.qa.test;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		int numbers[]= {-10,24,98,98678};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i =1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
				
			}
			else if(numbers[i]<smallest) {
				smallest=numbers[i];
				
			}
		}
		System.out.println("Given number of arraylist:"+Arrays.toString(numbers));
		System.out.println("Given the largest number:"+ largest);
		System.out.println("Given the largest number:"+ smallest);
		
		
		
	}

}
