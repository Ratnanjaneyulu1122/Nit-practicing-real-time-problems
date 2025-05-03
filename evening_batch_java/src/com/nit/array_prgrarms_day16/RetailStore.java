package com.nit.array_prgrarms_day16;

import java.util.Scanner;

public class RetailStore {

	public static void main(String[] args) {

		int[] sales = new int[7];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < sales.length; i++) {
			System.out.println("Enter the Sales for : " + (i + 1));
			sales[i] = sc.nextInt();
		}

		int minSale = sales[0];
		for (int i = 1; i < sales.length; i++) {
			if (minSale > sales[i]) {
				minSale = sales[i];
			}
		}
		System.out.println("Min Sale is: " + minSale);
		sc.close();
	}

}

/*
 * Q2) A retail store records the number of items sold per day over a week.
 * Management wants to analyze on which day the least number of items were sold.
 * Requirement: Write a Java program that takes the number of items sold each
 * day for 7 days in an array and finds the minimum value among them,
 * representing the day with the least sales.
 */