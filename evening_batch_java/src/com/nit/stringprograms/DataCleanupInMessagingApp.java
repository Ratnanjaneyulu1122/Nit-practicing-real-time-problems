package com.nit.stringprograms;

import java.util.Arrays;
import java.util.Scanner;

public class DataCleanupInMessagingApp {

	public static void messageFormatter(String str) {
//		String[] str1=str.split(".");
//		StringBuilder builder=new StringBuilder(Arrays.toString(str1));
//		System.out.println(builder.toString());
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the message");
		String str=sc.nextLine();
		messageFormatter(str);
		sc.close();
	}
}

/*
 * Scenario: Data Cleanup in Messaging App
__________________________________________
In a messaging application, users often send messages that are not properly formatted due to
accidental extra punctuation, especially when using speech-to-text. Your team is working on a
"Message Formatter" module that cleans and standardizes such messages.
-----------
One specific feature involves handling dot-separated messages (where words are separated by dots).
Sometimes users may accidentally add extra dots between or around the words. Your task is to reverse
the order of the words while ensuring that only single dots remain between them—removing any leading,
trailing, or multiple consecutive dots.
-----------
Create a static method to perform the task and then access the method from the main method.
You can take support of the predefine methods.
==============================
Hints:
- Use regular expressions to split the message based on one or more dots.
- Filter out empty strings during splitting.
- Join the words in reverse order with a single dot as separator.
=============================================
Test Cases:
Input: ..
Output: empty string
-----------------------
Input: .....
Output: empty string
-----------------------
Input: you.are.a.good.person.
Output: person.good.a.are.you
-----------------------
Input: ...alpha......
Output:  alpha
-------------------
Input: a..b...c
Output: c.b.a
---------------
 */