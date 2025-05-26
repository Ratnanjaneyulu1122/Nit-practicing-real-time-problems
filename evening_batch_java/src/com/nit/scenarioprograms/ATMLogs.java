package com.nit.scenarioprograms;

public class ATMLogs {

	public static void atmLogs(int[] arr) {
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (i % 2 == 0) {
				
				oddSum += arr[i];
			} else if (i % 2 != 0) {
				evenSum = oddSum + arr[i];// even day because 10 days stored as 0to 9 we take like this
			}
		}
		System.out.println("sum of transactions made on odd-numbered days: " + oddSum);
		System.out.println("sum of transactions made on even-numbered days: " + evenSum);
	}

	public static void main(String[] args) {
		// int[] atmLogs = { 22, 32, 12, 34, 45, 64, 77, 20, 32, 21 };
		int[] logs = { 22, 23, 43, 32, 25, 46, 57, 28, 59, 50 };
		atmLogs(logs);
	}

}

/*
 * Q1. A bank ATM logs the last 10 transactions a user has performed. You need
 * to analyze the transactions to find the sum of transactions made on
 * odd-numbered days and even-numbered days, assuming transactions are stored in
 * order of days from day 1 to day 10.
 * 
 * Explanation:
 * ---------------
 1.because we take the instead of even sum we take odd sum because array 
   index stars form 0 means the day count as 1 upto 10 we have the array index 
   so changed the even to odd and odd to even so values will calculate correct.
   --------------
 2. odd day means arr[0]=day1,arr[2]=day3,arr[4]=day5,arr[6]=day7,arr[8]=day9,
	so we are calculating days wise not array index wise so i changed like
	odd to even ,even to odd,so the calculations comes in days wise ok. 
 */