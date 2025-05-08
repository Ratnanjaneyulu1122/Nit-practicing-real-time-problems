package com.nit.array_prgrarms_day16;

import java.util.Scanner;

public class SecondLargestLalue {

	public static int getSecondLargest(int[] stocks) {

		if (stocks == null || stocks.length < 2) {
			return -1;

		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : stocks) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num < largest && num > secondLargest ) {
				secondLargest = num;

			}
		}
		return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] stocks = new int[5];

		for (int i = 0; i < stocks.length; i++) {
			System.out.println("Enter the " + (i + 1) + " stock you want to store: ");
			stocks[i] = sc.nextInt();
		}
		System.out.println("The second largest stocks: " + getSecondLargest(stocks));

		sc.close();

	}

}

//-20,80,40,40

/*
 * Scenario:
 * 
 * A warehouse inventory management system stores the quantity of various
 * products stocked on a given day. As part of analytics, the manager wants to
 * identify the , i.e., the product with the second highest distinct quantity in
 * stock. This will help identify which product is also in high demand, just
 * after the most stocked one.
 * 
 * You are required to implement a method that accepts an array of positive
 * integers where each integer represents the quantity of a product in stock.
 * The method should return the second highest distinct stock quantity. If all
 * products have the same quantity or there's only one distinct quantity, return
 * -1. Create a class InventoryAnalyzer. Define a method public static int
 * findSecondHighestStock(int[] stocks) which: -> Takes an integer array stocks
 * as input. -> Returns the second largest distinct element in the array or -1
 * if it doesn't exist. -> Include a main method to test the functionality using
 * multiple test cases.
 * 
 * Method Description:public static int findSecondHighestStock(int[] stocks) An
 * array of positive integers stocks[] representing product quantities. The
 * second highest distinct quantity or -1 if not available.
 * 
 * Test Cases: Input: stocks = [100, 200, 50, 300, 200] Output: 200 // 300 is
 * the largest, 200 is the second largest distinct stock
 * 
 * Input: stocks = [80, 80, 80] Output: -1 // All values are the same, no second
 * highest distinct value
 * 
 * Input: stocks = [45, 75, 45, 90, 75] Output: 75 // 90 is the largest, 75 is
 * the second largest distinct value
 * 
 * Input: stocks = [150] Output: -1 // Only one element, no second largest
 */
