package com.nit.streamprograms;

import java.util.Arrays;
import java.util.List;

class Employee {
	private String name, designation;
	private int age;
	private double performanceRating;

	public Employee(String name, String designation, int age, double performanceRating) {
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.performanceRating = performanceRating;
	}

	protected String getName() {
		return name;
	}

	protected String getDesignation() {
		return designation;
	}

	protected int getAge() {
		return age;
	}

	protected double getPerformanceRating() {
		return performanceRating;
	}

	@Override
	public String toString() {
		return "Employee: \nname=" + name + "\ndesignation=" + designation + "\nage=" + age + "\nperformanceRating="
				+ performanceRating + "\n";
	}

}

public class Problem2 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Rahul", "Software Developer", 27, 3.7),
				new Employee("Sandeep", "Software Tester", 27, 4.8), new Employee("Raghu", "DevOps", 30, 5.0),
				new Employee("james", "System Architecture", 25, 4.1));

		employees.stream().filter(employee -> employee.getPerformanceRating() > 4.0).forEach(System.out::println);
	}

}

/*
 * You are Developing HR module .Each Employee has details such as
 * name,age,designation, performanceRatings.Employees whose performance rating
 * is more than 4.0 are eligible for an appraical.WAP to Display the employee
 * details who are eligible for appraical.
 */