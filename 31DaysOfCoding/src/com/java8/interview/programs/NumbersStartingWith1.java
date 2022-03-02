package com.java8.interview.programs;

import java.util.List;

/**
 * 
 * Q2 Given a list of integers, find out all the numbers starting with 
 * 1 using Stream functions?

 * 
 * @author nitishgovekar
 *
 */
public class NumbersStartingWith1 {

	public static void main(String[] args) {

		List<Integer> numericList = List.of(10,20,30,50,110);
	
		numericList.stream().map(number->number+ " ")//Convert Integer to Strings
		.forEach(System.out::println);
		//numericList.stream().map(number->number +"").filter(number->number.startsWith("1")).forEach(System.out::println);
	}
	

}
