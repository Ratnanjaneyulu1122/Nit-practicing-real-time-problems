package com.nit.scenario_prgrarms_day15;

class User {
	private String name, phoneNumber, email;

	User() {
	}

	User(String name, String phoneNumber, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;

	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return phoneNumber;
	}

	public void displayUserInfo() {
		System.out.println("Name: " + name + "\nPhone: " + phoneNumber + "\nEmail: " + email);
	}
}

class Driver extends User {
	private String vechileNumber;
	private double rating;

	Driver() {

	}

	Driver(String name, String phoneNumber, String email, String vechileNumber, double rating) {
		super(name, phoneNumber, email);
		this.vechileNumber = vechileNumber;
		this.rating = rating;

	}

	public void setVechileNumber(String vechileNumber) {
		this.vechileNumber = vechileNumber;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getVechileNumber() {
		return vechileNumber;
	}

	public double getRating() {
		return rating;

	}
	
	public void displayDriverInfo() {
		super.displayUserInfo();
		System.out.println("Vechile Number: " + vechileNumber + "\nRating: " + rating);
	}
}

class Rider extends User {
	private String paymentMethod, rideType;

	Rider() {
	}

	Rider(String name, String phoneNumber, String email, String paymentMethod, String rideType) {
		super(name, phoneNumber, email);
		this.paymentMethod = paymentMethod;
		this.rideType = rideType;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}
	
	public void setRideType(String rideType) {
		this.rideType=rideType;
	}
	
	public String getRideType() {
		return rideType;
	}
	
	public void displayRiderInfo() {
		super.displayUserInfo();

		System.out.println("payment Method: " + paymentMethod + "\nRide Type: " + rideType);

	}
	
}

public class RideSharingApp {

	public static void main(String[] args) {
		// test Case:1
		Driver d1 = new Driver("Amit", "9876543210", "amit@driver.com", "KA01AB1234", 4.5);
		d1.displayDriverInfo();

		// Test Case:2
		Rider r1 = new Rider();
		r1.setName("Priya");
		r1.setPhoneNumber("9123456789");
		r1.setEmail("priya@rider.com");
		r1.setPaymentMethod("Credit Card");
		r1.setRideType("Luxury");
		r1.displayRiderInfo();

		// Test case: 3
		Driver d2 = new Driver();
		d2.setName(""); // error we providing 
		d2.setPhoneNumber(null); // error
		d2.setEmail("driver@test.com");
		d2.setVechileNumber("MH12XY1234");
		// i need to add validation -> Validation in setters (e.g., name should not be
		// empty, rating should be in range 0.0 to 5.0). after Adding validation this
		// should be a error -->but now i didn't added any validations
		d2.setRating(6.0);
		d2.displayDriverInfo();

		// Test case: 4
		Rider r2 = new Rider("Rohit", "9090909090", "rohit@rider.com", "UPI", "Standard");
		r2.setRideType("Premium");
		r2.displayRiderInfo();

	}

}
/*
Scenario:
--------------
You are developing a feature for a ride-sharing app like Uber or Lyft.
The system needs to manage information about different types of users.
Each user has a name, phone number, and email.
There are two specific user types: Driver and Rider.
A Driver has a vehicle number and rating.
A Rider has a payment method and preferred ride type.

You need to use inheritance to extend a base class, encapsulation
to protect user details, and constructor chaining for flexibility
in object creation.

Create a base class User with the following private attributes:

String name
String phoneNumber
String email

Create two subclasses:
Driver with additional attributes: String vehicleNumber, double rating
Rider with additional attributes: String paymentMethod, String rideType

Implement:
A default constructor in each class with default values using
constructor chaining.
A parameterized constructor to initialize all attributes.

Getters and setters for all fields to ensure encapsulation.
Validation in setters (e.g., name should not be empty, rating should
be in range 0.0 to 5.0).

Create the following methods:
- void displayUserInfo() in User to show name, phone, and email.
- void displayDriverInfo() in Driver to display full driver info.
- void displayRiderInfo() in Rider to display full rider info.

Test Case 1: Driver using parameterized constructor
-----------------------------------------------------
Driver d1 = new Driver("Amit", "9876543210", "amit@driver.com", "KA01AB1234", 4.5);
d1.displayDriverInfo();

Expected Output:
-----------------
Name: Amit  
Phone: 9876543210  
Email: amit@driver.com  
Vehicle Number: KA01AB1234  
Rating: 4.5  

Test Case 2: Rider using default constructor + setters
--------------------------------------------------------
Rider r1 = new Rider();
r1.setName("Priya");
r1.setPhoneNumber("9123456789");
r1.setEmail("priya@rider.com");
r1.setPaymentMethod("Credit Card");
r1.setRideType("Luxury");
r1.displayRiderInfo();

Expected Output:
----------------
Name: Priya  
Phone: 9123456789  
Email: priya@rider.com  
Payment Method: Credit Card  
Ride Type: Luxury  

Test Case 3: Invalid values in setters
----------------------------------------
Driver d2 = new Driver();
d2.setName("");
d2.setPhoneNumber(null);
d2.setEmail("driver@test.com");
d2.setVehicleNumber("MH12XY1234");
d2.setRating(6.0); // invalid
d2.displayDriverInfo();

Expected Output:
----------------
Invalid name provided.  
Invalid phone number.  
Invalid rating. Must be between 0.0 and 5.0  
Name: Unknown  
Phone: Unknown  
Email: driver@test.com  
Vehicle Number: MH12XY1234  
Rating: 0.0  

Test Case 4: Rider with partial input and update
--------------------------------------------------
Rider r2 = new Rider("Rohit", "9090909090", "rohit@rider.com", "UPI", "Standard");
r2.setRideType("Premium");
r2.displayRiderInfo();

Expected Output:
----------------
Name: Rohit  
Phone: 9090909090  
Email: rohit@rider.com  
Payment Method: UPI  
Ride Type: Premium  
========================================================================
 */
