package com.nit.scenario_prgrarms_day15;

class AmazonProduct{
	private String name,category;
	private double price;
}
public class FeatureAmazonApp {

	public static void main(String[] args) {

	}

}

/*
Scenario:
--------------
You are developing a feature for the Amazon app that handles product information.
Each product has a name, price, and category. You need to design a class that:
Uses encapsulation to protect the product details.
Has constructor overloading to allow different ways of creating a product.

Includes methods to:
- Return product details.
- Apply discount based on category ( 10% for Electronics, 20% for Clothing).
  Discount will not be applicable to product belonging to any other category.
- Update the product price.

Requirements:
Create a class AmazonProduct with the following private attributes:
String name
double price
String category

Implement:

A default constructor that initializes name as "Unknown", price as 0.0, and category
as "Misc".
A parameterized constructor to initialize all attributes.
Use getters and setters for all attributes to implement encapsulation.
Write the following methods:

- void displayProductDetails(): Displays product name, price, and category.
- void applyDiscount(): Applies discount based on the category.
- void updatePrice(double newPrice): Updates the product price.
----------------------------------------------------------------------------
Test Case 1: Parameterized Constructor - Electronics Category
Input:
AmazonProduct p1 = new AmazonProduct("Smartphone", 30000.00, "Electronics");
p1.applyDiscount();
p1.displayProductDetails();

Expected Output:
Product Name: Smartphone
Category: Electronics
Price after discount: 27000.0


Test Case 2:  Default Constructor + Setters - Clothing Category
AmazonProduct p2 = new AmazonProduct();
p2.setName("T-Shirt");
p2.setPrice(1500.00);
p2.setCategory("Clothing");
p2.applyDiscount();
p2.displayProductDetails();

Expected Output:
Product Name: T-Shirt
Category: Clothing
Price after discount: 1200.0

Test Case 3: Non-discount Category - Books
AmazonProduct p3 = new AmazonProduct("Book", 500.00, "Books");
p3.applyDiscount();
p3.displayProductDetails();

Expected Output:
No discount available for category: Books
Product Name: Book
Category: Books
Price after discount: 500.0

Test Case 4: Update Price Before Discount
AmazonProduct p4 = new AmazonProduct("Tablet", 20000.00, "Electronics");
p4.updatePrice(18000.00);
p4.applyDiscount();
p4.displayProductDetails();

Expected Output:
Product Name: Tablet
Category: Electronics
Price after discount: 16200.0


Test Case 5: Invalid Inputs in Setters
AmazonProduct p6 = new AmazonProduct("Laptop", 25000.00, "Electronics");
p6.setPrice(-1000.00);
p6.setName("");
p6.setCategory(null);
p6.applyDiscount();
p6.displayProductDetails();

Expected Output:
Invalid price. Price cannot be negative.
Invalid product name provided.
Invalid category provided.
Product Name: Laptop
Category: Electronics
Price after discount: 22500.0
 */