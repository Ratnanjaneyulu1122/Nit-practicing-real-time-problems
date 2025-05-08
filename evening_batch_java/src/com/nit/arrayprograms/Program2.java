package com.nit.arrayprograms;

//WAP to find the second largest and second smallest element in an array

public class Program2 {
	public static void findSmallestAndLargest(int[] arr) {
		// Arrays.sort(arr); //->PDM to sorting the elements
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) { // checking whether the array is sorted or not
			System.out.println(arr[i]);
		}
		System.out.println("the 2nd Smallest element: " + arr[1]);
		System.out.println("the 2nd Largest element: " + arr[arr.length - 2]);
	}

	public static void main(String[] args) {
		int arr[] = { -20, -14, 03, -12, 40, 55, 40 };
		findSmallestAndLargest(arr);

	}
}
