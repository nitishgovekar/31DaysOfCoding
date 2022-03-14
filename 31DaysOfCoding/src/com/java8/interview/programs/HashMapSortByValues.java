package com.java8.interview.programs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSortByValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();
		map.put("C", 20);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 50);
		map.put("A", 10);
		
        HashMap<String, Integer> temp
        = map.entrySet()
              .stream()
              .sorted((i1, i2)
                          -> i2.getValue().compareTo(
                              i1.getValue()))
              .collect(Collectors.toMap(
                  Map.Entry::getKey,
                  Map.Entry::getValue,
                  (e1, e2) -> e1, LinkedHashMap::new));
        
       
LinkedHashMap<String, Integer> linkedmap = new LinkedHashMap<>();
map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
forEach(x->linkedmap.put(x.getKey(),x.getValue()));




	
//output:   "D", "C", "B", "A"
	}

}
