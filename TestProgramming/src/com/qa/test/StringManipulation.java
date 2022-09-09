package com.qa.test;

public class StringManipulation {

	public static void main(String[] args) {

  String s= "Rahul is my name and last name is Prakash";
  String s1= "Rahul is my name and last Name is Prakash";
  
  System.out.println(s.length());
  System.out.println(s.charAt(7));
  System.out.println(s.indexOf('a'));
  System.out.println(s.indexOf('a', s.indexOf('a')+2));
  
//String Comparison:
  System.out.println(s.equals(s1));
  System.out.println(s.equalsIgnoreCase(s1));
  
  //Substring:
  
  System.out.println(s.substring(0, 5));
  
  //Trim:
  String str=" Hello  World ";
  System.out.println(str.trim());
  System.out.println(str.replaceAll(" ", ""));
  
  String str1="27/12/2021 ";
  
  System.out.println(str1.replace("/", "-"));
  
  
  

	}

}
