package com.nit.array_prgrarms_day16;

import java.util.Scanner;

public class SchoolSpecialWorkShop {

	public static void fetchTargetStudent(int[] arr, int target) {

		boolean isFound = false;
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				isFound = true;
				System.out.println("Roll number found :");
				break;

			} else {
				isFound = false;
			}
		}
		if (!isFound) {

			System.err.println("Roll number not found: ");

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Can you provide how many students you want to attend: ");
		int size = sc.nextInt();
		int[] studentsAttended = new int[size];
		for (int i = 0; i < studentsAttended.length; i++) {

			System.out.println("Enter the Student: " + (i + 1) + " : Roll Number.");
			studentsAttended[i] = sc.nextInt();
		}

		System.out.println(
				" can you enter which roll numebr you want to check,if the student is attended or not in the workShop:");
		int targetRollNo = sc.nextInt();
		fetchTargetStudent(studentsAttended, targetRollNo);
		sc.close();

	}

}

//Q5) A school maintains a list of student roll numbers who attended a special
//workshop. When a teacher wants to check if a particular student attended the
//session, the system should allow them to search using the roll number.
//Requirement:
//Write a Java program that stores student roll numbers in an array and allows
//the user to search for a specific roll number. If found, print a success
//message, otherwise display "Roll number not found."
