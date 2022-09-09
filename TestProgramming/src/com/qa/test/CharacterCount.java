
package com.qa.test;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		GetCharacterCount("test");



	}
	
	public static void GetCharacterCount(String name) {
		Map<Character,Integer> charcount = new HashMap<Character,Integer>();
			
		
	char []array =	name.toCharArray();
	for(char c:array) {
		if(charcount.containsKey(array)) {
			charcount.put(c, charcount.get(c)+1);
		}
		else {
			charcount.put(c, 1);
		}
	}
	System.out.println(" given character Array:"+charcount);
	
		
		
		
	}

}
