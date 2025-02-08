package com;

import java.util.Arrays;
import java.util.List;

public class NumbersFilter {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Using Lambda & Stream to filter and print odd numbers
		numbers.stream().filter(n -> n % 2 != 0) // Keep only odd numbers
				.forEach(System.out::println); // Print each number

		// Using Lambda & Stream to filter and print EVEN numbers
		System.out.println("~~~~~~~~~~~~~~~~~");
		numbers.stream().filter(n -> n % 2 == 0) // keep only even numbers
				.forEach(System.out::println);

		System.out.println("~~~~~~~~~~~~~~~~~");
		// Using Lambda & Stream to filter and print numbers less than or equal to 5
		numbers.stream().filter(n -> n <= 5).forEach(System.out::println);
		;
	}

}
