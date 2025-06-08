package com.nit.stringprograms;

public class Problem12 {

	public static String removeDuplicate(String s) {
		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					s = s.replace(s.charAt(i), ' ');
				}

			}

		}
		s = s.replace(" ", "");
		return s;

	}

	public static void main(String[] args) {
		String s = "abcdade";

		System.out.println(removeDuplicate(s));
	}
}

/*
Question.2)
-----------
Write a Java program to remove all duplicates character from a String.
you have to take one method as public static String removeDuplicate(String s);
inside main method take one String  from the user input. After that call
that method and print your output.
----------------
input: String s="abcdade";
Expected Output: "bce";


------------------ this not yest completed--------
for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			if (result.indexOf(currentChar) == -1) {
				result += currentChar;
			}
		}
		
		return result;
----------------------
 */