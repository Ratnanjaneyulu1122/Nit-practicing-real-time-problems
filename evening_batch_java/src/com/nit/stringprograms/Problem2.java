package com.nit.stringprograms;

public class Problem2 {
	public static void sumOfPair(int[] arr, int sumTarget) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if ((arr[i] + arr[j]) == sumTarget) {
					System.out.println("(" + arr[i] + "," + arr[j] + ")");
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 7, 8, 6, 9, 5, 3 };
		sumOfPair(arr, 10);
	}

}
/*
 * Question.1)
Write a java program  for finding the sum of pair of two integer of Array element is equal to given number or not.
Suppose: int []arr={2,4,7,8,6,9,5,3} and int sum= 10;
       output: pairs are:-
               (2,8)
               (4,6)
               (7,3)/
 */