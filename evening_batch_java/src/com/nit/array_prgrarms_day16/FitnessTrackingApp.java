package com.nit.array_prgrarms_day16;

import java.util.Scanner;

class User {
	public static void stepsCountFor10days() {
		int[] stepsCounts = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < stepsCounts.length; i++) {
			System.out.println("Enter the Day:" + (i + 1) + " Count Steps:.");
			stepsCounts[i] = sc.nextInt();
		}

		int totalSteps = stepsCounts[0];
		for (int i = 1; i < stepsCounts.length; i++) {
			totalSteps += stepsCounts[i];
		}
		System.out.println("The total Stepts count of 10 days you provided: " + totalSteps);

		int averageStepsDaily = totalSteps / stepsCounts.length;
		System.out.println("The average Steps per day is: " + averageStepsDaily);

		sc.close();
	}

}

public class FitnessTrackingApp {

	public static void main(String[] args) {
		User.stepsCountFor10days();

	}

}

/*
 * Q4) A fitness tracking app stores the number of steps taken by a user over 10
 * days. The app wants to show the user their total step count and average daily
 * steps. ->Requirement: Write a Java program that stores the number of steps
 * for 10 days in an array, calculates the total steps and average steps per
 * day, and displays the result.
 */