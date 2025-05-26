package com.nit.functionalprogramming;

import java.util.Scanner;

@FunctionalInterface
interface Number {
	void doublingAndSquareNumber(int a);
}

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positive integer");
		int num1 = sc.nextInt();
		// Note:-> we are not used Function Interface(PDI)
		Number n1 = (num) -> {
			if (num1 > 0) {
				// int doublingNumber = num + num;
				// int squaringNumber = num * num;
				// System.out.println("you provided number " + num + " doubling number: " +
				// doublingNumber);
				System.out.println("you provided number " + num + " double number: " + (num + num));
				// System.out.println("you provided number " + num + " squaring is: " +
				// squaringNumber);
				System.out.println("you provided number " + num + " squaring is: " + (num * num));
			} else {
				System.err.println("The entered num " + num1 + " is not a positive integer");
			}
		};

		n1.doublingAndSquareNumber(num1);

		sc.close();
	}
}

/*
 * Ques - 2 -------------- Number Transformation --- Write a Java program that
 * transforms a positive integer entered by the user using lambda expressions
 * and the Function functional interface. The program should use lambda
 * expressions to define the transformations: one to double the number and
 * another to square the number. ------- Your program should follow these
 * specifications: --- Input: ------ Prompt the user to enter a positive
 * integer. Processing: ------ Define a lambda expression to double the input
 * number using the Function interface. Define a lambda expression to square the
 * input number using the Function interface. Apply both lambda expressions to
 * the input number separately to obtain the transformed results. ---- Output:
 * ---------- Print the result of doubling the entered number. Print the result
 * of squaring the entered number./
 */