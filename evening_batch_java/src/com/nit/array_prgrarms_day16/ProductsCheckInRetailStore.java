package com.nit.array_prgrarms_day16;

import java.util.Arrays;

public class ProductsCheckInRetailStore {
	public static void findProduct(int[] productIds) {
		Arrays.sort(productIds);
		System.out.println("Arrays Elemts: " + Arrays.toString(productIds));
		int occurrenceCount = 0;

		for (int i = 0; i < productIds.length; i++) {
			int count = 0;
			for (int j = 0; j < productIds.length - 1; j++) {
				if (productIds[i] == productIds[j] && i > j) {
					break;

				}
				if (productIds[i] == productIds[j]) {
					count++;
				}

			}
			if (count > 1) {
				System.out.println(productIds[i] + " available " + count + " time ");
				occurrenceCount++;
			}

		}
		System.out.println(occurrenceCount + " product IDs are repeated");

	}

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int []products=new int[10];
		int[] productIds = { 101, 102, 103, 101, 104, 105, 102 };
		findProduct(productIds);

	}

}

/*
 * Q7) A retail store maintains a list of product IDs in an array. Sometimes,
 * due to system glitches,the same product ID is recorded multiple times. Write
 * a Java program to count how many product IDs are repeated (appear more than
 * once). Example Input: int[] productIds = {101, 102, 103, 101, 104, 105, 102};
 * Expected Output: 2 product IDs are repeated. /
 */