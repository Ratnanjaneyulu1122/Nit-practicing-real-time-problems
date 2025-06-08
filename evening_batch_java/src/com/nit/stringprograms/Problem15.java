package com.nit.stringprograms;

public class Problem15 {

	public static void convertVowelToUppercase(String str) {

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				ch = Character.toUpperCase(ch);

			} else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				ch = Character.toLowerCase(ch);

			}

			builder.append(ch);

		}
		System.out.println(builder.toString());
	}

	public static void main(String[] args) {
		String s = "Umbrella";
		convertVowelToUppercase(s);
	}
}

/*
 * Question.4)
write a java program to convert all Uppercase vowel character into lowercase and alllowercase
vowel character in to uppercase from a string.
input String s="Umbrella"
output:-> umbrEllA
 */