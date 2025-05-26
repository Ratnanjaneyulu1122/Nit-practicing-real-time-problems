package com.nit.arrayprograms;

//WAP to reverse an array
public class Program3 {

	public static void reverse(int[] arr) {

		// 1st way
		for (int i = 0; i < arr.length / 2; i++) {

			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		System.out.println("1st way to reverse an array using for loop");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// 2nd way 
		int start = 0;
		int end = arr.length;
		while (start > end) {
			int temp = start;
			start = end;
			end = temp;
			start++;
			end--;
		}
		System.out.println("@2nd way to reverse the array using while loop");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 45, 20, 30, 99, 56, 95, 40 };
		reverse(arr);
	}

}
