package com.nit.arrayprograms;

//Q5. WAP to sort an array in ascending order.
public class Program5 {

	public static void sortAssending(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 121, 22, 55, 34, 32, 11 };
		sortAssending(arr);

	}

}
