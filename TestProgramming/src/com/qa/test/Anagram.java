package com.qa.test;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(IsAnagram("Listen","Silent"));
		

	}
	public static boolean IsAnagram(String S1,String S2) {
		String str1= S1.replaceAll("\\s","");
		String str2= S2.replaceAll("\\s","");
		if(str1.length()!=str2.length()) {
			return false;
		}
		else {
		char []ch1=	str1.toLowerCase().toCharArray();
		char []ch2=	str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
		
		}
	}

}
