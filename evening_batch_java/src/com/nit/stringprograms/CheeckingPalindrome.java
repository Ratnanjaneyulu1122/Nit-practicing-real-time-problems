package com.nit.stringprograms;

public class CheeckingPalindrome {

	public static boolean isPalindrome(String input) {
		//one way this code not optimized
//		String rev = "";
//		for (int i = input.length() - 1; i >= 0; i--) {
//			
//			rev += input.charAt(i);
//		}
//		if (input.equals(rev)) {
//			return true;
//		} else {
//			return false;
//		}
		
		int start=0,end=input.length()-1;
		while (start<end) {
			if(input.charAt(start)!=input.charAt(end)) {
				return false;
			}
			else {
				start++;
				end--;
			}
			
			
		}
		return true;
		
		

	}

	public static void main(String[] args) {
		String s1 = "madam";
		String s2 = "Tiger";
		//boolean result = isPalindrome(s1);
		if (isPalindrome(s2)) {
			System.out.println("your String  is Palindrome");
		} else {
			System.err.println("your String is not a Palindrome");
		}

	}

}

/*
 Question.2)
------------ 
write a java program for checking the given String is Palindrome or not.
Take one Class as CheeckingPalindrome inside this class take one static method as
public static boolean isPalindrome(String input); inside this method write your logic 
for checking Palindrome.in the main method call this method and check your code.
------------------------------------
Example: input String s1="madam";
         output : your String madam is Palindrome.
         input String s1="Tiger";
         output : your String Tiger is not a Palindrome.
 ====================================================
 */