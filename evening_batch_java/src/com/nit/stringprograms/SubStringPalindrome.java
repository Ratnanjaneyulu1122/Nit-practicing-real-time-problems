
package com.nit.stringprograms;

public class SubStringPalindrome {
	public static boolean isPalindrome(String input) {

		int start = 0;
		int end = input.length() - 1;
		while (start < end) {
			if (input.charAt(start) != input.charAt(end)) {
				return false;
			} else {
				start++;
				end--;
			}

		}
		return true;
	}

	public static void subStringPalindrome(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j) && isPalindrome(str.substring(i, j + 1))) {
					System.out.println(str.substring(i, j + 1));

					count++;
				}

			}
		}
		System.out.println("total Substring palaindrome= " + count);
	}

	public static void main(String[] args) {
		String s1 = "madam";

		subStringPalindrome(s1);
	}

}

/*
 * Question.3)write a java program to print and count how many substrings are
 * palaindrome form given String. Example: Suppose input : String s="madam";
 * Output:-> Palaidrome SubStrings are: madam ada total Substring palaindrome=2
 */