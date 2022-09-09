package com.qa.test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {
	static String str="Rahul Prakash";

	public static void main(String[] args) {
		try {
			System.out.println(RemoveString(str));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
	public static String RemoveString(String str) {
		Set<Character> set = new HashSet<Character>();
		StringBuffer sf=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			Character c=str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
		}
		return sf.toString();
	}

}
