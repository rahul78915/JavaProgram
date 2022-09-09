package com.qa.test;

public class SortingINAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,24,2,78,98};
		int temp=0;
		System.out.println("Element of Orignal Arry");
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+"");

	}
		//sorting of an array
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
				System.out.println("Element of after sorting of an  Arry");
				for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]+"");

			}
		}
	
		}
	

