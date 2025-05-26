package com.nit.stringprograms;

public class Problem4 {
	
	public static void findMissingElements(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = arr[i] + 1; j < arr[i + 1]; j++) {  //--here checking the in between missing numbers arr[i]to arr[i+1]-like //j=1+1=2;2<4;j++--
				System.out.print(j + " ");

			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,4,9,15,19};
		findMissingElements(arr);
	}

}


/*
Question.1)
--------------
Write the java program for finding all missing Array sorted integer elements.
----------------
Example: input int[]arr={1,4,9,15,19};
       : output-> Missing elements are: 2,3,5,6,7,8,10,11,12,13,14,16,17,18.
note:- Array must be in the sorted order.
 *-----------------------------------------
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
			//j=1+1=2;2<4;j++
				System.out.print(j + " ");

			}
		}
	----------------------------------
 */