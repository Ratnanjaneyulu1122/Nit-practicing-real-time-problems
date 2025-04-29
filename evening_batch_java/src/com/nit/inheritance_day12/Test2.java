//----simple Java program using inheritance to manage student data-------
package com.nit.inheritance_day12;

class Student {
	protected String name;
	protected int rollNumber;

	Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public void displayDetails() {
		System.out.println("Name: " + name + "\nRollNumber: " + rollNumber);

	}

	public double calculatePercentage() {

		return calculatePercentage();

	}

}

class ScienceStudent extends Student {
	// Attributes: private int physicsMarks, private int chemistryMarks, private int
	// mathMarks

	private int physicsMarks, chemistrymarks, mathMarks;
	// private Student student;

	ScienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, rollNumber);
		this.physicsMarks = physicsMarks;
		this.chemistrymarks = chemistryMarks;
		this.mathMarks = mathMarks;
		// student = new Student(name, rollNumber);
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Physics Marks: " + physicsMarks + "\nChemistry Marks: " + chemistrymarks + "\nMath Marks: "
				+ mathMarks);

	}

	@Override
	public double calculatePercentage() {
		double percentage = ((double) (physicsMarks + chemistrymarks + mathMarks) / 300) * 100;
		return percentage;

	}

}

class ArtsStudent extends Student {
	private int historyMarks, geographyMarks, englishMarks;
	private Student student;

	ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) {
		super(name, rollNumber);
		student = new Student(name, rollNumber);
		this.historyMarks = historyMarks;
		this.geographyMarks = geographyMarks;
		this.englishMarks = englishMarks;

	}

	@Override
	public void displayDetails() {
		student.displayDetails();
		System.out.println("History Marks: " + historyMarks + "\nGeography Marks: " + geographyMarks
				+ "\nEnglish Marks: " + englishMarks);

	}

	@Override
	public double calculatePercentage() {
		int totalMarks = historyMarks + geographyMarks + englishMarks;
		double percentage = ((double) totalMarks / 300) * 100;
		return percentage;
	}

}

public class Test2 {

	public static void main(String[] args) {

		ScienceStudent scienceStudent = new ScienceStudent("Anjali", 101, 85, 90, 80);// "Anjali", 101, 85, 90, 80
		scienceStudent.displayDetails();
		System.out.println("Percentage: " + scienceStudent.calculatePercentage() + "%");
		System.out.println("--------------");
		ArtsStudent artsStudent = new ArtsStudent("Aryan", 102, 75, 80, 85);
		artsStudent.displayDetails();
		System.out.println("Percentage:" + artsStudent.calculatePercentage() + "%");
	}

}

/*
 * Que 2 : Calculate Student Percentage
====================================

Create a simple Java program using inheritance to manage student data.
We have a base class Student, and two subclasses: ScienceStudent and ArtsStudent.
Each subclass should calculate the percentage of marks based on its own set of subjects.
The percentage calculation will be done using an overridden method.

Define the base class Student
------------------------------
Attributes: protected Sreing name and protected int rollNumber.

Costructor:  A constructor to initialize these attributes

Methods: 1) public void displayDetails() a method to display student details.
         2) public double calculatePercentage() a method wich will calculate and return percentage.



Define class SceinceStudent extends from Student class
---------------------------------------------------------------
Attributes: private int physicsMarks, private int chemistryMarks, private int mathMarks
Costructor:  A constructor to initialize current class attributes and super class attributes.

Methods: Override displayDetails() a method to display parent class details as well current class details.
         Override calculatePercentage() a method wich will calculate and return percentage.




Define class class ArtsStudent extends from Student class
---------------------------------------------------------
Attributes: private int historyMarks, private int geographyMarks, private int englishMarks

Costructor:  A constructor to initialize current class attributes and super class attributes.

Methods: Override displayDetails() a method to display parent class details as well current class details.
         Override calculatePercentage() a method wich will calculate and return percentage.


Create Test class
-----------------
-> create main method
-> in main method create ScienceStudent object and  ArtsStudent object.
-> print the details of both class by calling displayDetails() method.
-> print the percentage of ScienceStudent & ArtsStudent by calling calculatePercentage() methods.


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading values for Student Class OR ScienceStudent class OR ArtsStudent class then make sure if any numeric value is <=0 then print "Error Invalid Input".
               
sample output : Error Invalid Input


TEST CASE 2 :
-------------
sample input : ScienceStudent scienceStudent = new ScienceStudent("Anjali", 101, 85, 90, 80);
               ArtsStudent artsStudent = new ArtsStudent("Aryan", 102, 75, 80, 85);

sample output :
                Science Student Details:
                Name: Anjali
                Roll Number: 101
                Physics Marks: 85
                Chemistry Marks: 90
                Math Marks: 80
                Percentage: 85.0%
               
                Arts Student Details:
                Name: Bob
                Roll Number: 102
                History Marks: 75
                Geography Marks: 80
                English Marks: 85
                Percentage: 80.0%

#######################################################################/
 */