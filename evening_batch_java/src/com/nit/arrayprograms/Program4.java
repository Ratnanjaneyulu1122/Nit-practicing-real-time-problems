package com.nit.arrayprograms;

//Q4. WAP to check whether an array contains a specific element.
public class Program4 {
	public static void containsElement(int[] arr, int element) {

		boolean isFound = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				isFound = true;
				System.out.println("element is found: " + arr[i]);
				break;

			}

		}
		if (isFound != true) {
			System.err.println("Element not found");
		}

	}

	public static void main(String[] args) {

		int[] elements = { 20, 33, 45, 99, 45, 322 };
		containsElement(elements, 45);
	}

}

/*
Q1. WAP to find the largest and smallest element in an array.
Q2. WAP to find the second largest and second smallest element in an array.
Q3. WAP to reverse an array.
Q4. WAP to check whether an array contains a specific element.
Q5. WAP to sort an array in ascending order.
Q6. WAP to sort an array in descending order.
Q7. WAP to find the duplicate elements in an array.
Q8. WAP to remove the duplicate elements from an array.
Q9. WAP to find the frequency of each element in an array.
Q10. WAP to find the sum of all elements in array.
 */