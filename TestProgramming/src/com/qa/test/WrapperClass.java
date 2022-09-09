package com.qa.test;

public class WrapperClass {

	public static void main(String[] args) {

String S="100";
System.out.println(S+20);
int i=Integer.parseInt(S);
System.out.println(i+20);

//String to double
String y ="12.33";
double d =Double.parseDouble(y);
System.out.println(d+10);

//integer  to string
int j =200;
System.out.println(j+20);
String s=String.valueOf(j);
System.out.println(s+20);


	}

}
