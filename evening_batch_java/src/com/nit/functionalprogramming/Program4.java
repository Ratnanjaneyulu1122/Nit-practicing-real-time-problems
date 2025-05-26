package com.nit.functionalprogramming;

import java.util.Scanner;

@FunctionalInterface
interface CheckNumberIsPrime {
	public abstract void checkPrimeOrNot(int num);
}

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("plese enter the positive integer:");
		int num1 = sc.nextInt();

		// note -> i am not used Predicate interface
		CheckNumberIsPrime c1 = (num) -> {

			if (num > 0) {
				if (num % 2 != 0 && num % 3 != 0 && num % 4 != 0) {
					System.out.println("The entered number " + num + " is prime: ");
				} else {
					System.err.println("The entered number " + num + " is not prime:");
				}
			} else {
				System.err.println("Plese enter only positive integer");
			}
		};
		c1.checkPrimeOrNot(num1);

		sc.close();
	}

}

/*
 * Ques - 1 -------------- Write a Java program that prompts the user to enter a
 * positive integer and checks if the entered number is both positive and prime.
 * The program should use lambda expressions to implement the necessary checks
 * and print out the results separately. -- Your program should follow these
 * specifications: -- Input: -- Prompt the user to enter a positive integer.
 * Processing: -- Implement a lambda expression to check if a given number is
 * positive, using the Predicate interface. Implement a lambda expression to
 * check if a given number is prime, using the Predicate interface. Use the
 * implemented lambda expressions to separately check if the entered number is
 * positive and if it is prime.
 * 
 * Output:
 * 
 * Print whether the entered number is positive. Print whether the entered
 * number is prime
 * 
 * Helpful information ---> A prime number is a natural number greater than
 * \(1\) that has no positive divisors other than \(1\) and itself. Divisibility
 * rule for \(2\): A number is divisible by \(2\) if its last digit is even.
 * Divisibility rule for \(3\): A number is divisible by \(3\) if the sum of its
 * digits is divisible by \(3\). Divisibility rule for \(4\): A number is
 * divisible by \(4\) if the number formed by its last two digits is divisible
 * by \(4\).
 */
