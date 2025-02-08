package com;

import java.util.Arrays;
import java.util.List;

public class NumbersFilter {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Using Lambda & Stream to filter and print odd numbers
		numbers.stream().filter(n -> n % 2 != 0) // Keep only odd numbers
				.forEach(System.out::println); // Print each number

	}

}
