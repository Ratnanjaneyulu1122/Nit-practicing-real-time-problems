package com.nit.array_prgrarms_day16;

import java.util.Arrays;

public class EventManagementSystem {

	public static void uniqueParticipantsId(int[] arr) {

		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			//int repeatedParticipants = Integer.MIN_VALUE;
			//if (arr[i] == arr[i + 1]) {
//				System.out.println("repeated Participants: " + arr[i]);
				//repeatedParticipants = arr[i];
				//System.out.println("repeated Participants: " + repeatedParticipants);

				for (int j = 1; j < arr.length - 1; j++) {

					if (arr[i] != arr[j]) {
						System.out.println(arr[i]);
					}
				}
			//}
		}
	}

	public static void main(String[] args) {

		int[] participantsid = { 301, 302, 303, 302, 304, 305, 301 };
		uniqueParticipantsId(participantsid);

	}

}

/*
 * Q10) In an event management system, participant IDs are recorded in an array.
 * The organizer wants to list only those participants who registered uniquely
 * (not repeated). Write a Java program to print all unique participant IDs.
 * Example Input: int[] participantIds = {301, 302, 303, 302, 304, 305, 301};
 * Expected Output: Unique Participants: 303, 304, 305
 */