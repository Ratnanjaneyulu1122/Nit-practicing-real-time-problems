package com.nit.inheritance_day12;

class Circle {
	double radious;

	Circle() {
		radious = 0;
	}

	Circle(double radious) {
		this.radious = radious;
	}

	public double getArea() {
		if (radious <= 0) {
			return -1;
		}
		double areaOfCircle = (3.14) * (radious * radious);
		return areaOfCircle;
	}

}

class Cylinder extends Circle {
	double height;

	Cylinder() {
		height = 0;
	}

	Cylinder(double radious, double height) {
		super(radious);
		this.height = height;

	}

	public double getVolume() {
		double volume = 3.14 * radious * radious * height;
		return volume;
	}
}

public class Test3 {

	public static void main(String[] args) {
		// Circle c = new Circle(5);
		// System.out.println("Area: "+c.getArea());

		Cylinder cylinder = new Cylinder(5, 5);
		System.out.println("Volume: " + cylinder.getVolume());
		System.out.println("Area: " + cylinder.getArea());

	}
}
/*
 * Que 3 : Circle and Cylinder Shape Calculation Program
======================================================

You are tasked with developing a software application for a company that designs
custom containers.
The company needs to calculate the surface area of circular bases and the volumes
of cylindrical containers to estimate materials and costs.
To achieve this, you will create a Java program with the following requirements:


Class Circle is given to you.
----------------------------

Add below details to the class

1. Instance variables:

radius: double.

2. Create a no constructor that assigns default values to instance variables.

3. Create parameterized constructor that accepts radius.

4. Create below methods,

Method name: getArea

Return type: double

This method should return the area of the circle. Return -1 if radius is negative.

Create a sub class of Circle with name Cylinder
-----------------------------------------------

Add below details to the class

1. Instance variables:

height: double.

2. Create a No constructor that assigns default values to instance variables.

3. Create parameterized constructor that accepts radius, height.

4. Create below methods,

Method name: getVolume

Return type: double

This method should return the volume of the cylinder. Return -1 if height is negative.

An ELC class ShapeTester is given to you with a main method. Use this class to test your



Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading values for Circle Class OR Cylinder class then make sure if any numeric value is <=0 then print "Error Invalid Input".
               
sample output : Error Invalid Input


TEST CASE 2 :
-------------
sample input  : Cylinder c = new Cylinder(5, 5);
sample output : Volume = 392.5
                Area = 78.5

#######################################################################
/
 */