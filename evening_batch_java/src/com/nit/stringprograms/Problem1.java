package com.nit.stringprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
	public static void checkAnagramOrNot(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String s1 = Arrays.toString(ch1);
		String s2 = Arrays.toString(ch2);
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Anagram");
		} else {
			System.err.println("Not Anagram");
		}
//-----------------2nd way------------------//
	
		for (int i = 0; i < ch1.length; i++) {
						for (int j = 0; j < ch2.length; j++) {
							if (ch1[i] == ch2[j]) {
								
								
							}
						}
					}
		
					

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String str1 = sc.nextLine();
		System.out.println("Enter Second String: ");
		String str2 = sc.next();
		checkAnagramOrNot(str1, str2);
		sc.close();
	}

}

/*
Question.1)-->
 Write a Java program  that checks if two strings are anagrams of each other or not 
 (ignoring case and spaces).
 ==================
input: String s1="listen"; String  s2="silent";
output : Given Strings are anagram.
==================
input: String s1="Triangle"; String  s2="Integral"
output : Given Strings are anagram.
======================
input: String s1="apple"; String s2="pale";
output : Given Strings are  not anagram./
 */