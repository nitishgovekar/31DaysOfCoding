package com.java8.interview.programs;

import java.util.List;

/**
 * 
 * Q6 Given a list of integers, find the maximum value element 
 * present in it using Stream functions?

 * @author nitishgovekar
 *
 */
public class FindMaxElement {

	public static void main(String[] args) {

		List<Integer> numericList = List.of(11,12,12,14,17,18);
		int max = numericList.stream().max(Integer::compare).get();
		System.out.println(max);
		
		
		
	}

}
