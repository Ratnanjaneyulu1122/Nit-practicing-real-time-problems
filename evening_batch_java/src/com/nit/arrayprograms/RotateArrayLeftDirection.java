package com.nit.arrayprograms;

import java.util.Arrays;

public class RotateArrayLeftDirection {

	public static int[] leftShif(int[] arr,int numberOfRotation) {
		
		for(int i=1;i<=numberOfRotation;i++) {
			
			for (int j = 1; j < arr.length; j++) {

				int temp = arr[0];
				arr[0] = arr[j];
				arr[j] = temp;

			}

		}
		return arr;
	}
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int numberOfRotation=3;
		leftShif(arr, numberOfRotation);
		System.out.println(Arrays.toString(arr));
	}
}

/*
 * RotateArrayLeftDirection** Question.3) write a java program to rotate an
 * array in the left direction. you have to take one class name as
 * RotateArrayLeftDirection and take one static method as : public static int[]
 * leftShift(int[]arr,int numberOfRotation ){return arr;} inside main method you
 * have to take one array and take one local varial which hold number of
 * rotation. after that you need to call leftShift(int[]arr,int numberOfRotation
 * ); that will return array element. and print your results.
 * ========================================= Example 1: input
 * int[]arr={1,2,3,4,5} and int numberOfRotation=1;-----> Output arr
 * ={2,3,4,5,1} ====================================== Example 2: input
 * int[]arr={1,2,3,4,5} and int numberOfRotation=3;----> Output arr
 * ={4,5,1,2,3}; ==========================================
 */