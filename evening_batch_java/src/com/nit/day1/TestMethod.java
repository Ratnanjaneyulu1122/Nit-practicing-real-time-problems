package com.nit.day1;

public class TestMethod {

	public static int findMax(int... a) {

		int max = Integer.MIN_VALUE;

		/*
		 * using for loop
		 * 
		 * for (int i = 1; i < a.length; i++) { if (a[i] > max) { max = a[i]; }
		 * 
		 * }
		 */

		// Using for each loop
		for (int i : a) {
			if (i > max) {
				max = i;
			}

		}

		System.out.println("the max of numbers: " + max);
		return max;

	}

	public static double sumDouble(double... a) {

		double sum = 0;

		for (double i : a) {
			sum += i;

		}

		System.out.println("the sum of double " + "numbers: " + sum);
		return sum;

	}

	public static int findTargetNumber(int target, int... numbers) {
		for (int number : numbers) {
			if (number == target) {

				System.out.println("====the target number is found in the given collection of numbers===== :" + number);

			} else {
				System.out.println("the target number did not found in the given colletion of numbers");
			}
		}

		return target;

	}

	public static void displyDetails(String name, String habbit) {

		System.out.println("the person name you entered:" + name);
		System.out.println("the persom habbit:" + habbit);
	}

	public static String cancatStrings(String... strings) {

		StringBuilder builder = new StringBuilder();
		for (String string : strings) {
			builder.append(string);
		}

		return builder.toString();

	}

	public static String cancatString(String... strings) {

		// StringBuilder stringBuilder = new StringBuilder();
		// String concatinatedSting = null;

		String result = "";

		for (int i = 0; i < strings.length; i++) {

			result += strings[i];
		}

		/*
		 * using foreach loop==>: for (String string : strings) { result += string; }
		 */
		return result;

	}

	public static void main(String[] args) {

		findMax(10, 20, 60, 30, 50);
		sumDouble(10.4, 10.6, 30.5);
		findTargetNumber(55, 10, 50, 45, 27, 25, 50, 49, 28, 55);
		displyDetails("Johnwick", "Actor");
		System.out.println(cancatString("raj", " ", "hellow,", "hai"));
		System.out.println(cancatStrings("hai", "raj"));
	}
}
