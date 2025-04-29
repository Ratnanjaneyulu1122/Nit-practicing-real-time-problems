package com.nit.inheritance_day12;

public class OnlineShoppingTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 * Que 8 : Online Shopping System
==============================

You are building an Online Shopping System, and you need to create a class hierarchy to represent different types of products that customers can purchase. You will be implementing a set of classes that model the products and their attributes. The focus of this problem is to demonstrate the use of inheritance and method overriding in Java.

Follow the provided code as a base, and create the necessary classes to satisfy the requirements below:

Create a class named Product:
-----------------------------
It should have protected instance variables name (String) and price (double).
Implement a constructor that initializes the name and price.
Define a method displayInfo() that prints the product's name and price.
Define a method calculateTotalCost(int quantity) that calculates and returns the total cost of purchasing a given quantity of the product.

Create a subclass named Electronics:
------------------------------------
Extend the Product class.
Add a private instance variable brand (String).
Implement a constructor that takes name, price, and brand as parameters and initializes the superclass constructor.
Define a method displayInfo() method to additionally print the product's brand.

Create another subclass named Clothing:
---------------------------------------
Extend the Product class.
Add a private instance variable size (String).
Implement a constructor that takes name, price, and size as parameters and initializes the superclass constructor.
Define a method  displayInfo() method to additionally print the product's size.

Create a class named OnlineShopping (as provided in the code):
--------------------------------------------------------------
In the main method, create instances of both Electronics and Clothing with appropriate values.
Print information about each product, including their specific attributes.
Calculate and print the total cost for a given quantity of each product.

Your task is to implement the required classes based on the provided problem description. This will help you practice inheritance concepts.

Note-Implement toString() in all the BLC classes to print the data of the corresponding objects.

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
               Electronics Product:
               Name: "Laptop"
               Price: $1200.00
               Brand: "Dell"
               Quantity: 2
               
               Clothing Product:
               Name: "T-Shirt"
               Price: $25.00
               Size: "Medium"
               Quantity: 3

sample output :
               Electronics Details:
               Product Name: Laptop
               Price: $1200.0
               Brand: Dell
               Total Cost for 2 units: $2400.0
               Electronics [name=Laptop, price=1200.0, brand=Dell]
               
               Clothing Details:
               Product Name: T-Shirt
               Price: $25.0
               Size: Medium
               Total Cost for 3 units: $75.0
               Clothing [name=T-Shirt, price=25.0, size=Medium]/
 */