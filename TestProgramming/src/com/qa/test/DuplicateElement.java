package com.qa.test;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"Java" ,"Python", "Java","C"};
		System.out.println("Brute Force");
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println(names[i]);
				}
			}
			
		}
		
		

	}

}
