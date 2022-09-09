package com.qa.test;

public class RotationalString {

	public static void main(String[] args) {
		System.out.println(isRotational("abcd","bcda"));
	}
		// TODO Auto-generated method stub

		public static boolean isRotational(String str,String rotational) {
			if(str==null || rotational==null) {
				return false;
			}
				else if(str.length()!=rotational.length()) {
				
					return false;
				}
				else {
					String concateneded = str+str;
					return concateneded.contains(rotational);
				}
			
		
	}
	}


