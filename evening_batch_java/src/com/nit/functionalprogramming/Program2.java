package com.nit.functionalprogramming;

@FunctionalInterface
interface NumberChecker {
	void evenOrNot(int a);
}

public class Program2 {
	public static void main(String[] args) {

		NumberChecker n1 = (num) -> {
			if (num % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Not even");
			}
		};

		n1.evenOrNot(22);
	}
}

/*
 * 2. WAP WAP for the following requirement: - create a functional interface
 * which has a functionality to take a number and display whether it is even or
 * not - prepare functional programming with support of lambda expression to
 * provide implementation to the Single Abstract Method(SAM).
 */