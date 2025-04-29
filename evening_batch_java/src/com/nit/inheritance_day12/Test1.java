//-----------Simple Vehicle Inheritance in Java------------
package com.nit.inheritance_day12;

class Vechile {
	String make, model;
	int year;

	public Vechile(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	void displayDetails() {
		System.out.println("Make: " + make + "\n" + "Model: " + model + "\n" + "Year: " + year);
	}
}

class Car extends Vechile {

	// private Vechile vechile;

	int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		if (year > 0 && numberOfDoors > 0) {

			this.numberOfDoors = numberOfDoors;
			// vechile = new Vechile(make, model, year);

		} else {
			System.out.println("Error Invalid Input");

		}

	}

	@Override
	void displayDetails() {
		// vechile.displayDetails();
		super.displayDetails();
		System.out.println("Number of Doors: " + numberOfDoors);

	}
}

class Bike extends Vechile {
	// private Vechile vechile;

	String type;

	public Bike(String make, String model, int year, String type) {
		super(make, model, year);
		if (year > 0) {
			this.type = type;
			// vechile = new Vechile(make, model, year); //->another way
		} else {

			System.out.println("Error Invalid Input");
		}

	}

	@Override
	void displayDetails() {
		// vechile.displayDetails();
		super.displayDetails();
		System.out.println("Bike Type: " + type);

	}

}

public class Test1 {

	public static void main(String[] args) {

		Car car = new Car("Audi", "Q8", 2021, 4);
		System.out.println("Car Details: ");
		car.displayDetails();

		// Bike bike=new Bike(null, null, 0, null);
		Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
		System.out.println("\nBike Details:");
		bike.displayDetails();

	}

}

/**
 Que 1 : Simple Vehicle Inheritance in Java
===========================================

Demonstrating Inheritance to Simplify and Extend Class Functionality and
This motto emphasizes the key educational goal of the program: to show how inheritance
can be used to simplify code by reusing existing class functionality and extending
it with new features specific to derived classes.


Define the base class Vehicle
-------------------------------

Attributes:
make: String
model: String
year: int

Constructor:
Vehicle(String make, String model, int year): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the vehicle.



Define the subclass Car Inherits from Vehicle
---------------------------------------------

Attributes:
numberOfDoors: int

Constructor:
Car(String make, String model, int year, int numberOfDoors): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the car, overriding the method from Vehicle.



Define the subclass Bike Inherits from Vehicle
----------------------------------------------

Attribute:
type: String

Constructor:
Bike(String make, String model, int year, String type): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the bike, overriding the method from Vehicle.



Create Test class
-----------------
-> create main method
-> in main method create Car object and Bick object.
-> Print the details of Car class and Bick class by calling displayDetails() methods of both class.


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading values for Vehicle class OR Car class OR Bike class then make sure if any numeric value is <=0 then print "Error Invalid Input".
               
sample output : Error Invalid Input



TEST CASE 2 :
-------------
sample input : Car car = new Car("Audi", "Q8", 2021, 4);
               System.out.println("Car Details:");
               car.displayDetails();

               Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
               System.out.println("\nBike Details:");
               bike.displayDetails();


sample output :
                Car Details:
                Make: Audi
                Model: Q8
                Year: 2021
                Number of Doors: 4

                Bike Details:
                Make: Yamaha
                Model: MT-07
                Year: 2020
                Type: Sports


#######################################################################
 */