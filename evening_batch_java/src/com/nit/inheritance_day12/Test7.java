package com.nit.inheritance_day12;

class Animal1 {
	private String name;
	private int age;

	public Animal1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void makeSound() {
		System.out.println("The animal makes a generic sound.");
	}

	void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}

}

class Lion extends Animal1 {

	private int maneLength;

	public Lion(String name, int age, int manelength) {
		super(name, age);
		this.maneLength = manelength;
	}

	void makeSound() {
		System.out.println("The lion roars loudly.");
	}

	void displayManeLength() {
		System.out.println("Mane Length: " + maneLength + "cm");
	}

}

class Elephant extends Animal1 {

	private float tuskLength;

	public Elephant(String name, int age, float tusklength) {
		super(name, age);
		this.tuskLength = tusklength;
	}

	void makeSound() {
		System.out.println("The elephant trumpets.");
	}

	void displayTuskLength() {
		System.out.println("Tusk Length: " + tuskLength + "meters");
	}

}

public class Test7 {

	public static void main(String[] args) {

		Lion lion = new Lion("Simba", 5, 20);
		System.out.println("Lion Details:");
		lion.displayInfo();
		lion.makeSound();
		lion.displayManeLength();

		System.out.println("Elephant Details:");
		Elephant elephant = new Elephant("Jumbo", 10, 2.5f);
		elephant.displayInfo();
		elephant.makeSound();
		elephant.displayTuskLength();

	}

}
/*
 * Que 7 : Zoo Management System
=============================

You are tasked with creating a Zoo Management System that can handle different types of animals.
You need to implement classes that represent animals and their specific characteristics.
In this system, you'll implement the concept of inheritance and method overriding to showcase the behavior of animals.

Follow the provided code as a base, and create the necessary classes to satisfy the requirements below:

Create a class named Animal:
-----------------------------
It should have private instance variables name (String) and age (int).
Implement a constructor that initializes the name and age.
Define a method makeSound() that prints "The animal makes a generic sound."
Define a method displayInfo() that prints the name and age.

Create a subclass named Lion:
-----------------------------
Extend the Animal class.
Add a private instance variable maneLength (int).
Implement a constructor that takes name, age, and maneLength as parameters and initializes the superclass constructor.
Define a method makeSound() method to print "The lion roars loudly."
Define a method displayManeLength() that prints the maneLength.

Create another subclass named Elephant:
---------------------------------------
Extend the Animal class.
Add a private instance variable tuskLength (float).
Implement a constructor that takes name, age, and tuskLength as parameters and initializes the superclass constructor.
Define a method  the makeSound() method to print "The elephant trumpets."
Define a method displayTuskLength() that prints the tuskLength.

Create a class named ZooManagement (as provided in the code):
-------------------------------------------------------------
In the main method, create instances of both Lion and Elephant with appropriate values.
Print information about the lion and the elephant, including their specific attributes and the sounds they make.

Your task is to implement the required classes based on the provided problem description.


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading numeric values for any above Classe then make sure if any numeric value is <=0 then print "Error Invalid Input".
               
sample output : Error Invalid Input



TEST CASE 2 :
-------------
sample input :
               Lion:
               Name: "Simba"
               Age: 5
               Mane Length: 20 cm

               Elephant:
               Name: "Jumbo"
               Age: 10
               Tusk Length: 2.5 meters

sample output :
               Lion Details:
               Name: Simba, Age: 5
               The lion roars loudly.
               Mane Length: 20 cm
               
               Elephant Details:
               Name: Jumbo, Age: 10
               The elephant trumpets.
               Tusk Length: 2.5 meters


#######################################################################
 */