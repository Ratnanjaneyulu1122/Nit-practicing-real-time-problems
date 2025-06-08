package com.nit.streamprograms;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Program2 {
	// creating a stream using splitAsStream

	public static void main(String[] args) {
		String sentence = "java is easy to learn only when you feel it";
		// regular Expression regex .Pattern.compile
		Pattern.compile(" ").splitAsStream(sentence).forEach(System.out::println);

		// write the code and print n natural numbers up 10
		//Stream.iterate(1, n -> n + 1).limit(10).forEach(System.out::println);
		// Stream.iterate(1, n -> n + 2).limit(5).forEach(System.out::println);

		// code update after java 9 onwards with out using limit()..
		Stream.iterate(1, n -> n <= 10, n -> n + 1).limit(10).forEach(System.out::println);
		Stream.iterate(1, n -> n <= 10, n -> n + 1).limit(10).forEach(System.out::println);
	}
}

