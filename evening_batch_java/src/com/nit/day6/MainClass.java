package com.nit.day6;

import java.util.Arrays;
import java.util.Scanner;

/* 1-> count vowels and  consonants
 *->  write a program to input a string and count the number of vowels and consonants in it:
 *
 * /
 * 
 */

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the sentence: ");
		findCountVowels_Consonents(sc.nextLine());

		sc.close();

	}

	public static void findCountVowels_Consonents(String str) {

		int vCount = 0, cCount = 0;
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if ((ch == 'a' && ch == 'z') || (ch == 'A' && ch == 'Z')) {
				if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
						|| ch == 'u' || ch == 'U') {
					vCount++;
				} else {
					cCount++;
				}
			}
		}

		System.out.println("no.of vowels: " + vCount);
		System.out.println("no.of Consonents: " + cCount);

	}

}

//2->

class TestString2 {
	public static void reverseString(String str) {
		String rev = "";
		char ch;
		for (int i = str.length() - 1; i >= 0; i++) {
			ch = str.charAt(i);
			rev = rev + ch;
		}
		System.out.println("Reverse is: " + rev);

	}
}

//3->Check for palindrome: write a program to check whether an input string is palindrome or not (eg.:madam,racecar)

class TestString3 {
	public static void palindromeOrNot(String str) {

		String rev = "";
		char ch;
		for (int i = str.length() - 1; i >= 0; i++) {
			ch = str.charAt(i);
			rev = rev + ch;
		}
		if (rev.equals(str)) {
			System.out.println("the provided input is palindrome:");
		} else {
			System.out.println("not palindorme");
		}

	}
}

//4)->Count words in a sentence -> input a sentence and count the number of words are separated by a single spaces
//esplet sequence
//testcase1)if the string before and last have the spaces to add trim();
//testcase2) if have the string multiple spaces like befor have 4+ etc,, we need to use split method
class TestString4 {
	public static void countWords(String str) {

		/*
		 * public static void countWords(String str) { //best solution for the count of
		 * words // String words[] = str.trim().split("\\s+"); //split("\\s")->will not
		 * work in test3we need to a use like //s+ ion the split() method //
		 * system.out.println(Arrays.toSting(words));
		 * //system.out.println("no.words"+words.length); // }
		 * 
		 */
		int wordCount = 0;

		// best solution for the count of words
		// String words[] = str.trim().split("\\s+"); //split("\\s")->will not work in
		// test3we need to a use like //s+ ion the split() method
		// system.out.println(Arrays.toSting(words));
		// system.out.println("no.words"+words.length);
		// }

		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == ' ') {
				wordCount++;
			}
		}
		System.out.println("the total no.of words are:" + wordCount);
	}
}

//5)->convert to title case -> write a program to convert the first letter of each word in a sentence to uppercase
class TestString5 {
	public static void firstLetterUppercase(String str) {
		String words[] = str.trim().split("\\s+"); // split("\\s")->will not work in test3we need to a use like //s+ ion
													// the split() method
		System.out.println(Arrays.toString(words));
		System.out.println("no.words" + words.length);

		char ch;
		for (int i = 0; i < words.length; i++) {
			ch = words[i].charAt(0);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32);
				words[i] = ch + words[i].substring(1);
			}

		}
		System.out.println("new word: " + Arrays.toString(words));

	}
}
