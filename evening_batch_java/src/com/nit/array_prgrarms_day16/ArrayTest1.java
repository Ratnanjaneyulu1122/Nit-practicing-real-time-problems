package com.nit.array_prgrarms_day16;

import java.util.Scanner;

/*
 * write a program to allow the user to specify how many elements has to be stored.
 * After then enter the elements and perform the following operations:
 *  1). Display all the elements
 *  2). Display the elements which are divisible by 5
 *  3). Display the positive elements
 *  4). Display the negative numbers
 *  5). Display the sum of all the elements
 *  6). Display the elements which are divisible by both 2 and 3.
 * /
 */

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the no. of elemts to be stored ");
		int size = sc.nextInt();
		if (size > 0) {
			int arr[] = new int[size];
			System.out.println("Array Created.");
			System.out.println("Enter " + size + " Elements into Array");
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Elements Entered Successfully.");
			System.out.println("Enter Your Choice:");
			System.out.println("   1. Display all the elements\n"
					+ "   2. Display the elements which are divisible by 5\n" + "   3. Display the positive elements\n"
					+ "   4. Display the negative elements\n" + "   5. Display the the sum of all the elements\n"
					+ "   6. Display  the elements which are divisible by both 2 and 3.");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				displayAllElements(arr);
				break;
			case 2:
				displayElementsDivisibleBy5(arr);
				break;
			case 3:
				displayPositiveElements(arr);
				break;
			case 4:
				displayNegativeElements(arr);
				break;
			case 5:
				displaySumOfElements(arr);
				break;
			case 6:
				displayElementsDivisibleBy2_3(arr);
				break;
			default:
				System.out.println("Invalid choice");
			}
		} else {
			System.err.println("Array Size should not be negative:");
		}
		sc.close();

	}

	public static void displayElementsDivisibleBy2_3(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] % 3 == 0) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void displaySumOfElements(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum: " + sum);
	}

	private static void displayNegativeElements(int[] arr) {
		System.out.println("Displaying Negative nubers:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.println(arr[i]);
			}

		}

	}

	public static void displayPositiveElements(int[] arr) {
		System.out.println("Displaying positive nubers:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.println(arr[i]);
			}

		}

	}

	public static void displayElementsDivisibleBy5(int[] arr) {
		System.out.println("Elements divisible by 5 which are Stored in Array.");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				System.out.println(arr[i]);
			}
		}

	}

	public static void displayAllElements(int[] arr) {
		System.out.println("Elements Stored in Array.");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
