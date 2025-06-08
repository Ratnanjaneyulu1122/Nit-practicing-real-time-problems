package com.nit.streamprograms;

import java.util.Arrays;
import java.util.List;

/*
 * WAP to display /
 */

class Student {
	private String id, name;
	private double percentage;

	public Student(String id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = marks;
	}

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected double getPercentage() {
		return percentage;
	}

	protected void setPercentage(double marks) {
		this.percentage = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", percentage=" + percentage + "]";
	}

}

public class Problem1 {
	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("James", "James123", 90), new Student("Jacob", "JC212", 80),
				new Student("Robin", "R321", 70));

		students.stream().filter(student -> student.getPercentage() > 80).forEach(System.out::println);
	}

}
