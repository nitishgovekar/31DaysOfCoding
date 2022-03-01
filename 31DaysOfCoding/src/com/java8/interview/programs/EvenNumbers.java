package com.java8.interview.programs;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Q1 Given a list of integers, find out all the even numbers exist in the list 
 * using Stream functions?

 * @author nitishgovekar
 *
 */
public class EvenNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10,2,1,11,14,13,17);
		System.out.println("The list of even numbers is : ");
		numbers.stream().filter(number->number%2==0).forEach(System.out::println);
		System.out.println("The list of odd numbers is : ");
		numbers.stream().filter(number->number%2!=0).forEach(System.out::println);
	}

}
