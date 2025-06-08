package com.nit.streamprograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class Problem3 {

	public static void main(String[] args) {
		String[] s = { "SashiKant", "Raone", "Bhole", "Tomato" };
		Stream<String> stream = Arrays.stream(s);
		stream.forEach(s1 -> System.out.println(s1 + ":" + s1.length()));

		//stream.forEach(inp -> System.out.println(inp + ":" + inp.length()));
	}
}

/*
Write a java program for finding each String length from Strings Array through 
Stream api method.
input: String[]s={"SashiKant","Raone","Bhole","Tomato"};
--------
output:
-------
SashiKant: 9
Raone: 5
Bhole: 5
Tomato: 6
 */