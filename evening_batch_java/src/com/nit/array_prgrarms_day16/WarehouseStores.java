package com.nit.array_prgrarms_day16;

import java.util.Scanner;

public class WarehouseStores {

	public static void weightsOfAllPackages() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the how many packages received in a day.");
		int size = sc.nextInt();
		double[] weightsOfAll = new double[size];

		for (int i = 0; i < weightsOfAll.length; i++) {
			System.out.println("Enter the package: " + (i + 1) + ": Weight received.");
			weightsOfAll[i] = sc.nextDouble();

		}
		System.out.println("All Weights of packages is stored in a list:");

		System.out.println("Enter the Specific package weight to check the package is available or not: ");
		double specificPackage = sc.nextDouble();

		boolean isFound = false;
		for (int i = 0; i < weightsOfAll.length - 1; i++) {

			if (specificPackage == weightsOfAll[i]) {
				isFound = true;
				System.out.println(
						"The position of the list of specific package weight  you provided position is : " + (i + 1));

				break;
			} else {
				isFound = false;
			}

		}
		if (!isFound) {
			System.err.println("the specific package weight you mentioned  is not found: ");
		}

		sc.close();
	}

	public static void main(String[] args) {
		weightsOfAllPackages();

	}
}

/*
 * Q6) A warehouse stores the weights of all packages received in a day. When a
 * supervisor searches for a specific package weight, the system should report
 * its position in the list. -----------Requirement:----- Write a Java program
 * to store package weights in an array. Accept a weight from the user and print
 * the index location of the weight if it exists. If not found, display an
 * appropriate message.
 */