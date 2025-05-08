package com.nit.array_prgrarms_day16;

import java.util.Arrays;
import java.util.Scanner;

public class LoyaltyRewardsSystem {

	public static void findDuplicateCustomer(int[] arr) {

		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("duplicate customer id: " + arr[i]);
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] customerIds = new int[5];
		System.out.println("Enter the customer ids upto 5");
		for (int i = 0; i < customerIds.length; i++) {

			customerIds[i] = sc.nextInt();
		}
		findDuplicateCustomer(customerIds);
		sc.close();

	}

}

/*
 * Q9) In a loyalty rewards system, customer IDs are stored in an array. Due to
 * system errors, some customer IDs were registered multiple times. Write a Java
 * program to print all duplicate customer IDs from the given array. Example
 * Input: int[] customerIds = {2001, 2002, 2003, 2001, 2004, 2002}; Expected
 * Output: Duplicate Customer IDs: 2001, 2002
 */
