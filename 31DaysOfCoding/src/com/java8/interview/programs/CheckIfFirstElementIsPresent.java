package com.java8.interview.programs;

import java.util.List;

public class CheckIfFirstElementIsPresent {

	public static void main(String[] args) {

		List<Integer> numericList = List.of(10,20,30,40);
		numericList.stream().findFirst().ifPresent(System.out::println);
		long count = numericList.stream().count();
		System.out.println("List Count:" + count);
	}

}
