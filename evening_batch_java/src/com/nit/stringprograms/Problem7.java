package com.nit.stringprograms;

public class Problem7 {
	public static void convertFirstWordUppercase(String str) {

		String[] str1 = str.split(" ");

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < str1.length; i++) {

			builder.append(Character.toUpperCase(str1[i].charAt(0)))
			.append(str1[i].substring(1)).append(" ");
			
			
		}

		System.out.print(builder.toString().trim());

	}
	public static void main(String[] args) {
		
		String s1="hello world this is nareshit technology";
		convertFirstWordUppercase(s1);
	}
}

/*
 *Question.1)
 write a java program for  Converting each first character of word in to Uppercase from the String.
 ----------------------------
 input: String s1="hello world this is nareshit technology". 
 output: Hello World This Is Nareshit Technology.
--------------------------------------------------------------------------------------------
 */