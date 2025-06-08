package com.nit.stringprograms;

import java.util.Scanner;

//is palindrome or nor
public class Problem6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s1=sc.nextLine();
		
		int start=0,end=s1.length()-1;
		while (start<end) {
			if(s1.charAt(start)!=s1.charAt(end)) {
				break;
			}
			else {
				start++;
				end--;
			}
			
		}
		
		if(start==end) {
			System.out.println("Polinndrome");
		}
		else {
			System.out.println("Not polindrome");
		}
		sc.close();
	}
}
