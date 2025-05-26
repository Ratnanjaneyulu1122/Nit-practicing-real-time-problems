package com.nit.functionalprogramming;

@FunctionalInterface
interface DisplayWords {
	void displayNumberToWord(int num);
}

public class Program3 {
	public static void main(String[] args) {
		DisplayWords d1 = (num) -> {
			String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
			if (num >= 0 && num <= 9) {
				System.out.println(words[num]);
			} else {
				System.out.println("Try Again");
			}

		};
		d1.displayNumberToWord(3);
	}
}

/*
 * 3. WAP WAP for the following requirement: - create a functional interface
 * which has a functionality to take a number and display it in words(only if it
 * is with in 0-9) otherwise display try again.
 * 
 * - prepare functional programming with support of lambda expression to provide
 * implementation to the Single Abstract Method(SAM).
 */