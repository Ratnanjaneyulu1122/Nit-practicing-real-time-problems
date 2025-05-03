package com.nit.interface_programs_day14;

interface Vechile {

	// by default these methods are abstract
	public void start();

	public void stop();
}

class Driver implements Vechile {

	@Override
	public void start() {

		System.out.println("Vechile started");
	}

	@Override
	public void stop() {
		System.out.println("Vechile Stoped");

	}

}

public class Test1 {

	public static void main(String[] args) {

		Driver driver = new Driver();
		driver.start();
		driver.stop();

	}

}

/*
 * Q1)Vehicle and Driver 1.WAP for the below requirements: Create an interface
 * 'Vehicle' Operations of Vehicle: start() stop() Create an implementation
 * class where sub class(sub class name - Driver) developer is forced to
 * complete the operations. Create a main class and invoke the operations to be
 * performed./
 */