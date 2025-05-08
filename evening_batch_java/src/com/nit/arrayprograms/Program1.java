package com.nit.arrayprograms;

import java.util.Arrays;

//wap to find the largest and smallest  in AN array
public class Program1 {

	// write a program to swap the values of 2 variables using third variable
	public static void swapElements() {
		int a = 10;
		int b = 20;
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("value of a: " + a);
		System.out.println("value of b: " + b);

	}

	public static void main(String[] args) {
		// 1st way-> Using pre-defined method to sort so that we can get smallest and
		// largest in interview time we are not using the PDM.
		System.out.println("-----1st way to find-----");
		int[] arr = { 88, 10, 103, 6, 90, 22, 45, };
		Arrays.sort(arr); // PDM to sorting
		int min = arr[0];
		int max = arr[arr.length - 1];
		System.out.println("the smallest element: " + min);
		System.out.println("The Largest element: " + max);

		// --------2nd way --------------//
		// use nested Loop to fetch each elements and compare with remaining
		// validate and swap the values
		// print the elements
		System.out.println("-----2nd way to find-----");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}

		}
		for (int i = 0; i < arr.length; i++) { // printing the array elements sorted or not
			System.out.println(arr[i]);

		}
		System.out.println("The Smallest element:  " + arr[0]);
		System.out.println("The largest Elememnt: " + arr[arr.length - 1]);

	}

}
