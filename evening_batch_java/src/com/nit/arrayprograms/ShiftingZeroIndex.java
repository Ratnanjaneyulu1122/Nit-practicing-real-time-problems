package com.nit.arrayprograms;

//import java.util.Arrays;

public class ShiftingZeroIndex {

	public static void lastIndexZero(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] == 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

	public static void firstIndexZero(int[] arr) {

		int l = arr.length - 1;
		for (int i = l; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[l--] = arr[i];
			}

		}
		for (int i = l; i >= 0; i--) {
			arr[i] = 0;
		}
		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

	public static void main(String[] args) {
		int[] num = { 0, 1, 0, 2, 5, 0, 4, 0, 6, 0 };

		lastIndexZero(num);
		System.out.println("\n-----------------");
		firstIndexZero(num);
	}
}

/*
 * Question.1) Write a java program for shiffing the zero in the last indexes of
 * the Array. Example 1:- Suppose input int []x={0,1,0,2,5,0,4,0,6,0}; :- Output
 * should be :-> x={1, 2, 5, 4, 6, 0, 0, 0, 0, 0};
 * 
 * Example 2:- Suppose input int []x={0,0,1,0,2,5,0,0,0,4,0,6,0,0}; :- Output
 * should be :-> x={1, 2, 5, 4, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0};/
 * ---------------------------------------------------------------------
 * Question.2) Write a java program for shiffing the zero in the first indexes
 * of the Array. Example 1:- Suppose input int []x={0,1,0,2,5,0,4,0,6,0}; :-
 * Output should be :-> x={ 0, 0, 0, 0, 0,1,2,5,4,6};
 * 
 * Example 2:- Suppose input int []x={0, 0, 1, 0, 2, 5, 0, 0, 0, 4, 0, 6, 0,0};
 * :- Output should be :-> x={0, 0, 0, 0, 0, 0, 0, 0, 0,1, 2, 5, 4, 6 };
 * ------------------------------------------------------
 */// first index zero not work this line of code.,,
//for (int i = 0; i < arr.length - 1; i++) {
//
//			for (int j = 0; j < arr.length-1; j++) {
//				
//				if (arr[j] > 0 ) {   //->in this code last index is not a non zero element the did not work
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}/