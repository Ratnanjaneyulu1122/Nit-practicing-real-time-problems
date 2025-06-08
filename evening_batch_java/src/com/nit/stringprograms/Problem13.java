package com.nit.stringprograms;

public class Problem13 {
	
	public static void main(String [] args) {
		String s="HeLLo World";
		
		//StringBuilder result=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch)) {
				s=s.replace(s.charAt(i), Character.toLowerCase(s.charAt(i)));
			}else if (Character.isLowerCase(s.charAt(i))) {
				s=s.replace(s.charAt(i),Character.toUpperCase(s.charAt(i)));
			}
			
		}
		System.out.println(s);
	}

}

/*
 *Question.3)
Write a java program to convert all lowercase character into UpperCase and convert all 
Uppercase Character into lowercase from a String.
Suppose: input String s="HeLLo World"
Expected output: hEllO wORLD  

 */