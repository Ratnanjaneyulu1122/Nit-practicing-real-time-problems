package com.nit.array_prgrarms_day16;

import java.util.Scanner;

public class CourseStudentsProgressDayily {

	public static void dailyProgress() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the how many days you to get the progress:");
		int size = sc.nextInt();
		int[] days = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the day: " + (i+1) + " Attendance");
			days[i] = sc.nextInt();
		}
		int maxAttendance = days[0];
		for (int i = 1; i < days.length; i++) {
			if (maxAttendance < days[i]) {
				maxAttendance = days[i];
			}
		}
		System.out.println("maximum attendance recorded: " + maxAttendance);
		sc.close();
	}

	public static void main(String[] args) {

		dailyProgress();
	}

}

/*
 * Q3)An online course platform tracks the number of students attending live
 * classes each day. The instructor wants to know the day with the highest
 * attendance to evaluate the most engaging session. Requirement: Write a Java
 * program that stores the attendance for each day in an array and finds the
 * maximum attendance recorded./
 */