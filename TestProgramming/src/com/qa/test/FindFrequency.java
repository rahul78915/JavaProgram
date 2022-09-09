package com.qa.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFrequency {

	public static void main(String[] args) {
		
		
		
	int arr[]= {1,2,3,4,1,2,3,4,4,4,5};
	Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
	for(int i=0;i<arr.length;i++) {
		if(hm.containsKey(arr[i])) {
			hm.put(arr[i], hm.get(arr[i])+1);
			
		}
		else {
			hm.put(arr[i], 1);
		}
		
		for(Map.Entry entry:hm.entrySet()) {
			System.out.println("Element||Frequency");
			System.out.println(entry.getKey()+"   "+ entry.getValue());
			
			
			
		}
	}

	}

}
