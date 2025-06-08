package com.nit.streamprograms;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//----------working on stream ----------------//
public class Program1 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 50, 60, 77, 32, 90 };

		// Creating a stream of using Of method 1st way
		IntStream s = Arrays.stream(arr);
		s.forEach(System.out::println);
		// s.findAny();// we can get error IllegalStateException stream has already been
		// operated upon // or closed

		String[] course = { "Java", "c", "devops", "DSA", ".net" };

		//Stream<String> stream = Arrays.stream(course);
		// stream.forEach(System.out::println); //->using method reference to printing
		//stream.forEach(inp -> System.out.println(inp)); // ->using lambda expression.

		Arrays.stream(course).forEach(System.out::println);

		// Creating a stream of using Of() method 2nd way
		Stream<String> stream2 = Stream.of("Albert", "nano", "Swift");
		stream2.forEach(System.out::println);

		//Creating stream by using generate()->method
		Stream<Double> randomNumbers=Stream.generate(Math::random).limit(10);
		randomNumbers.forEach(System.out::println);
		
		
	}
}
