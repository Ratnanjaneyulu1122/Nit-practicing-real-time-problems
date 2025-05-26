package com.nit.functionalprogramming;

@FunctionalInterface
interface DisplayNumber {
	void disply(int a);
}

class Display implements DisplayNumber {

	@Override
	public void disply(int a) {
		System.out.println("The input a is Displaing using normal extende class: " + a);
	}

}

public class Program1 {

	public static void main(String[] args) {
		// 1st
		Display display = new Display();
		display.disply(34);
		// 2nd
		DisplayNumber s1 = (num) -> System.out.println("using of lamba expression a value: " + num);
		s1.disply(22);

	}

}

/*
 * 1. WAP for the following requirement: -> create a functional interface which
 * has a functionality to display the number taken an input. -> prepare
 * functional programming with support of lambda expression to provide
 * implementation to the Single Abstract Method.
 */