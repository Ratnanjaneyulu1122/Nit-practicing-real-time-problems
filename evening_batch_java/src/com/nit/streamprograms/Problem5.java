package com.nit.streamprograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem5 {
	
	public static void main(String[] args) {
		String words="I Love My India";
		 String result = Arrays.stream(words.split(" "))
	                .map(word -> new StringBuilder(word).reverse().toString())
	                .collect(Collectors.joining(" "));

	        System.out.println(result);
	}
}
/*
 * Question.3)
write the java program for reverse the Sentence in word by word .
input: String words="I Love My India";
output: I evoL yM aidnI.
note:-> you have to use stream api method.
 */

