package com.nit.inheritance_day12;

class Animal {
	private String name;

	Animal(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void displayDetails() {
		System.out.println("Animal Name: " + name);
	}
}

class Mammal extends Animal {

	private boolean hasFur;

	Mammal(String name, boolean hasFur) {
		super(name);
		this.hasFur = hasFur;

	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Has Fur: " + hasFur);
	}

}

class Dog extends Mammal {

	private String breed;

	Dog(String name, boolean hasFur, String breed) {
		super(name, hasFur);
		this.breed = breed;

	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Breed: " + breed);
	}

}

/*
 * sample input : Dog myDog = new Dog("Buddy", true, "Golden Retriever");
 * 
 * sample output : Dog Details: Animal Name: Buddy Has Fur: Yes Breed: Golden
 * Retriever /
 */
public class Test4 {
	public static void main(String[] args) {

		System.out.println("Dog Details: ");
		Dog dog = new Dog("Buddy", true, "Golden Retriever");
		dog.displayDetails();
	}

}

/*
 * Que 4 : A Hierarchical Model of Animals
========================================

Scenario Description:

In a virtual zoo management system, you need to organize and categorize various types of animals to efficiently manage their characteristics and behaviors.
To achieve this, you decide to implement a class hierarchy using multilevel inheritance.

1. Create the Animal Class
Requirements:
Define a private String attribute named name.
Implement a parameterized constructor to initialize name.
Implement getter and setter methods for name.
Create a method to display the animal's details.

2. Create the Mammal Class
Requirements:
Extend the Animal class.
Add a private boolean attribute named hasFur.
Implement a parameterized constructor to initialize name (from Animal) and hasFur.
Implement getter and setter methods for hasFur.
Override the displayDetails method to include information about fur.

3. Create the Dog Class
Requirements:
Extend the Mammal class.
Add a private String attribute named breed.
Implement a parameterized constructor to initialize name, hasFur (from Mammal), and breed.
Implement getter and setter methods for breed.
Override the displayDetails method to include information about the breed.

4. Create the Main Class
Requirements:
Create an instance of the Dog class.
Display details of the Dog object to demonstrate inheritance.


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading numeric values for any above Classe then make sure if any numeric value is <=0 then print "Error Invalid Input".
               
sample output : Error Invalid Input



TEST CASE 2 :
-------------
sample input : Dog myDog = new Dog("Buddy", true, "Golden Retriever");
               
sample output :
               Dog Details:
               Animal Name: Buddy
               Has Fur: Yes
               Breed: Golden Retriever


#######################################################################
 */