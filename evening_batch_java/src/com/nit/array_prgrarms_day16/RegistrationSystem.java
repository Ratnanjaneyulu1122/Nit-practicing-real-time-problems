package com.nit.array_prgrarms_day16;

import java.util.Scanner;

class EventRegistaration {
	public static void rigisterStudent() {
		String id[] = new String[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < id.length; i++) {
			System.out.println("Enter Id: " + (i + 1));
			id[i] = sc.next();
		}
		DisplayAllStidentss(id);
		sc.close();
	}

	public static void DisplayAllStidentss(String[] id) {

		for (int i = 0; i < id.length; i++) {
			System.out.println(id[i]);
		}
	}
}

public class RegistrationSystem {

	public static void main(String[] args) {

		EventRegistaration.rigisterStudent();
	}

}

/*
 * Q1) A college has a new online registration system for events. Each student
 * registering for an event is given a unique registration ID. The college wants
 * to dynamically store these registration IDs as students register one by one.
 * Requirement: Write a Java program that allows dynamic insertion of
 * registration IDs into an array using Scanner. After all registrations are
 * complete, display all stored registration IDs.
 * 
 * like that wap to store the elements like the above scenario and print the
 * elements /
 */