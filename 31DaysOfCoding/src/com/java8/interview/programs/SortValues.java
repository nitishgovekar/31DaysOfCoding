package com.java8.interview.programs;

import java.util.Collections;
import java.util.List;

public class SortValues {

	public static void main(String[] args) {

		List<Integer> numericList = List.of(10,11,4,5,67,7);
		numericList.stream().sorted().forEach(System.out::println);
		
		numericList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
