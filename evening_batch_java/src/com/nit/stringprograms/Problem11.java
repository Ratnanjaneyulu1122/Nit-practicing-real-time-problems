package com.nit.stringprograms;

public class Problem11 {

	public static String removeAllOccurance(String s, char ch) {
		StringBuilder builder = new StringBuilder(s);

		for (int i = 0; i < builder.length(); i++) {
			if (s.charAt(i) == ch) {
				builder.deleteCharAt(i);
			}
		}
		
		

		return builder.toString();
	}

	public static void main(String[] args) {
		String s = "programming";
		char remove = 'm';
		System.out.println("Before removing occurrences :\n" + s);
		System.out.println("After removing all occurrences: \n" + removeAllOccurance(s, remove));
	
	}
}

/*
Question.1)
------------
Write a Java program to remove all occurrences of a given character from a String.
you have to take one method as public static String removeAllOccurance(String s,char ch);
inside main method take one String and one character from the user input. After that call
that method and print your output.
---------------------
input: String s="programming", char to remove = 'm'
Expected Output: "prograing";
 */

/*one way----------,
 * String str = ""; for (int i = 0; i < s.length(); i++) { // if (s.charAt(i) !=
 * ch) { // //str += s.charAt(i); } // } ///
 */
 