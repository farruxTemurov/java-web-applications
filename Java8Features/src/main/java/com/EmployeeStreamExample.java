package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamExample {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", 60000), new Employee("Bob", 45000),
				new Employee("Charlie", 70000), new Employee("David", 30000), new Employee("Eve", 90000));

		List<String> highEarners = employees.stream().filter(emp -> emp.getSalary() > 50000) // Step 1: Filter
				.sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())) // Step 2: Sort
				.map(emp -> emp.getName().toUpperCase()) // Step 3: Convert to uppercase
				.collect(Collectors.toList()); // Step 4: Collect result

		System.out.println("High earners: " + highEarners);
	}
}
