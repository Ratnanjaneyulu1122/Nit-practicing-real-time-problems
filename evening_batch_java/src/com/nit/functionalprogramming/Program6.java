package com.nit.functionalprogramming;

import java.util.Scanner;

@FunctionalInterface
interface DiscountPolicy {
	double applyDiscount(double totalAmount, boolean hasHighSpending);
}

@FunctionalInterface
interface CustomerSpendingHabitChecker {
	boolean hasHighSpending(double totalPurchaseAmount);
}

public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Online Bookstore!");
		System.out.println("---------------------\nEnter the total order amount in rupees:\n-------------");
		double totalAmount = sc.nextDouble();
		CustomerSpendingHabitChecker c1 = (amount) -> {

			System.out.println("Does the customer have high spending habits? (yes/no):");
			String s = sc.next();
			if (s.equals("yes") || s.equals("Yes")) {
				return true;

			} else if (s.equals("no") || s.equals("No")) {
				return false;

			}
			return false;

		};
		boolean b = c1.hasHighSpending(totalAmount);
		DiscountPolicy d1 = (amount, hasHighSpending) -> {

			double afterDiscount = 0;
			if (amount > 1000 && hasHighSpending == false) {
				afterDiscount = amount - (amount * 0.10);

			} else if (amount > 1000 && hasHighSpending == true) {
				afterDiscount = amount - (amount * 0.15);
			}

			return afterDiscount;

		};
		double result = d1.applyDiscount(totalAmount, b);
		System.out.println("Total cost after discount: " + result);
		sc.close();

	}
}

/*
 * Ques - 3
--------------
Dynamic Discount Calculation for Online Bookstore
-------
You are assigned to develop a Java program for an online bookstore that calculates the 
total cost of a customer's order with a dynamic discount system. The discount calculation 
is influenced by the customer's spending habits rather than their membership status. Your
task is to design a flexible solution using functional interfaces and lambda expressions 
to handle the discount calculation process effectively.
--------------
Your program should include the following components:
------------
Functional Interfaces:
---------
Define a functional interface named DiscountPolicy with a method 
double applyDiscount(double totalAmount, boolean hasHighSpending) that encapsulates 
the logic for applying discounts based on the current policy. The hasHighSpending 
parameter indicates whether the customer has high spending habits.
---------
Functional Interface for Customer Spending Habits:
-----------
Define another functional interface named CustomerSpendingHabitChecker with a method 
boolean hasHighSpending(double totalPurchaseAmount) that checks if the customer's total
purchase amount exceeds a certain threshold, indicating high spending behavior.
---------------
Main Program:
-------
Prompt the user to enter the total order amount in rupees.
Prompt the user to specify the customer's spending habits (whether they have high spending or not).
Apply the lambda expressions representing the discount policy and customer spending habit 
checking to calculate the discounted amount based on the provided inputs.--
Calculate and print the total cost of the order after applying the discount in rupees.
-----------------
Discount Policy Logic:
----------------
Initially, the discount policy offers a 10% discount for orders above ₹1000 and an 
additional 5% discount for customers with high spending habits. The discount policy can 
be modified in the future to accommodate different thresholds and percentages.
----------------
Sample Input and Output:
----------------------------
Welcome to the Online Bookstore!
---------------------
Enter the total order amount in rupees: 1200
Does the customer have high spending habits? (yes/no): no

Total cost after discount: 1080.00
 */
