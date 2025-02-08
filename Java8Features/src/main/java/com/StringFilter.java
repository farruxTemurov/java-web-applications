package com;

import java.util.Arrays;
import java.util.List;

public class StringFilter {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");

		fruits.stream().map(fruit -> fruit.toUpperCase()).forEach(System.out::println);
//		fruits.stream().map(String::toUpperCase) // Convert each string to uppercase
//				.forEach(System.out::println); // Print each modified string

	}

}
