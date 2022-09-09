package com.qa.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		findDuplicateWords("Java is the langugage java is the");

	}
	
	public static void findDuplicateWords(String input) {
		//Split
		
		String words[]=input.split("");
		
		Map<String,Integer> wordcount= new HashMap<String,Integer>();
		
		// checking for each word in array
		for(String word:words) {
			
			//if word is present:
			if(wordcount.containsKey(word)) {
				wordcount.put(word.toLowerCase(),wordcount.get(word)+1);
				
			}
			else {
				wordcount.put(word, 1);
			}
			
			
		
	}
		Set<String> wordString=wordcount.keySet();
		
		
		for(String word:wordString) {
			if(wordcount.get(word)>1) {
				System.out.println(word+":"+wordcount.get(word));
			}
			
		}
	}
}
	
	
	


