package com.java8.interview.programs;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {

	public static void main(String[] args) {

		Map<String, String> hashMap = new HashMap<String, String>();
		
		
		hashMap.put("Nitish", "Govekar");
		hashMap.put("Apurv", "Govekar");
		
		//Prints key and Values from hashMap
		hashMap.entrySet().forEach(System.out::println);
		
		//Prints values of keys
		hashMap.keySet().forEach(System.out::println);
		
		//Prints only values
		hashMap.values().forEach(System.out::println);
		
	}

}
