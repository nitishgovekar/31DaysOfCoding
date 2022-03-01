package com.java8.interview.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * Q3 How to find duplicate elements in a given integers list in 
 * java using Stream functions?

 * @author nitishgovekar
 *
 */

public class FindDuplicateElementInList {

	public static void main (String args[]) {

		List<Integer> myList = Arrays.asList(10,10,10,20,10,22);
		Set<Integer> set = new HashSet();
		myList.stream()
		.filter(n -> !set.add(n))
		.forEach(System.out::println);

	}

}
