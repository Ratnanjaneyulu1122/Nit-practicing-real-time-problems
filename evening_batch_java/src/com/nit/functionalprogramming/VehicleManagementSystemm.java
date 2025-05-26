package com.nit.functionalprogramming;

class Vechile{
	
	class Car{
		private int numberOfDoors;
		private double fuelEfficiency;
		void calculateFuelConsumption(double distance) {
			double fuelConsumpton=distance/fuelEfficiency;
			System.out.println("Fuel consumption of the car: "+fuelConsumpton);
		}
		public  int getNumberOfDoors() {
			return numberOfDoors;
		}
		public double getFuelEfficiency() {
			return fuelEfficiency;
		}
	}
	class Truck{
		double loadCapacity;
		String cargoType;
		
		public double determineAvailableSpace(double currentLoad) {
			//logic is there 
			return 0.0;
		}
		public String getCargoType() {
			return cargoType;
		}
		public double getLoadCapacity() {
			return loadCapacity;
			
		}
		
	}
	class MotorCycle{
		int engineCapacity;
		boolean hasSpecialFeatures;
		public boolean checkSpecialFeatures(boolean specialFeature) {
			//logic
			return false;
		}
		public int getEngineCapacity() {
			return engineCapacity;
		}
		public boolean getHasSpecialFeatures() {
			return hasSpecialFeatures;
		}
	}
}
public class VehicleManagementSystemm {
	public static void main(String[] args) {

	}
}

/*
 * Ques - 4
--------------
Vehicle Management System with Inner Classes
------------------
You are tasked with developing a Java program for managing different types of vehicles in
a transportation system. The program should allow users to add vehicles, perform vehicle-specific 
operations, and manage vehicle details efficiently. Your objective is to design a flexible solution 
using inner classes to encapsulate related functionalities within the vehicle management system.
-------------
Your program should include the following components:
-----------
Car Class (Inner Class of Vehicle):
------------
Attributes:--->
numberOfDoors (int): The number of doors in the car.
fuelEfficiency (double): The fuel efficiency of the car in kilometers per liter.
Methods:-------->
calculateFuelConsumption(double distance): Calculates the amount of fuel consumed by the car 
to travel a specified distance based on its fuel efficiency.
getNumberOfDoors(): Retrieves the number of doors in the car.
getFuelEfficiency(): Retrieves the fuel efficiency of the car.
------------
Truck Class (Inner Class of Vehicle):
------------
Attributes:--------->
loadCapacity (double): The maximum load capacity of the truck in tons.
cargoType (String): The type of cargo the truck is designed to carry.
Methods:------>
determineAvailableSpace(double currentLoad): Determines the available space for additional 
cargo based on the current load and maximum load capacity.
getCargoType(): Retrieves the type of cargo the truck is designed to carry.
getLoadCapacity(): Retrieves the maximum load capacity of the truck.
-------->
Motorcycle Class (Inner Class of Vehicle):
==========
Attributes:--->
engineCapacity (int): The engine capacity of the motorcycle in cubic centimeters (cc).
hasSpecialFeatures (boolean): Indicates whether the motorcycle has special features or not.
Methods:--------------->
checkSpecialFeatures(): Checks if the motorcycle has any special features.
getEngineCapacity(): Retrieves the engine capacity of the motorcycle.
hasSpecialFeatures(): Checks if the motorcycle has special features.
============
To test the code:
-------------
Implement the VehicleManagementSystem class with the outlined functionalities.
Create instances of different types of vehicles (car, truck, motorcycle) and add them to the system.
Call the appropriate methods to perform vehicle-specific operations, such as calculating fuel 
consumption, determining available space, and checking special features.
Finally, view the details of all vehicles in the system to verify the results.
===========
Sample Output :
---------------------
Fuel consumption of the car: 6.45 liters
Available space in the truck: 5.0 tons
Checking special features of the motorcycle: true
==========
Vehicle Details:
Car: Sedan
- Number of Doors: 4
- Fuel Efficiency: 15.5 km/l
=============
Truck: Cargo Truck
- Load Capacity: 10.5 tons
- Cargo Type: Goods
================
Motorcycle: Sports Bike
- Engine Capacity: 1000 cc
- Special Features: Yes
 */