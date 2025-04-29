package com.nit.day9;


class Customer {
	private String customerName;
	private double monthlySpending;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getMonthlySpending() {
		return monthlySpending;
	}

	public void setMonthlySpending(double monthlySpending) {
		this.monthlySpending = monthlySpending;
	}

	public void displayDetails() {
		System.out.println("Customers Details: ");
		System.out.println("Customer Name: " + getCustomerName());
		System.out.println("Customer Monthly Spending: " + getMonthlySpending());
	}
}

class CardType {

	private String cardName;

	public String getCardName() {
		return cardName;
	}

	public static CardType getCardTypes(Customer customer) {
		CardType cardType = new CardType(); // Creating an object without using a constructor
		double spending = customer.getMonthlySpending();

		// Spending < 10000: Silver
		// Spending 10000 - 50000: Gold
		// Spending > 50000: Platinum
		if (spending < 10000) {
			cardType.cardName = "Silver";
		} else if (spending <= 50000) {
			cardType.cardName = "Gold";
		} else {
			cardType.cardName = "Platinum";
		}

		return cardType;
	}
}

public class CustomerMain {
	public static void main(String[] args) {

		Customer cus1 = new Customer();
		cus1.setCustomerName("hari");
		cus1.setMonthlySpending(35000);
		cus1.displayDetails();
		System.out.println("Card Type: " + CardType.getCardTypes(cus1).getCardName());
		// CardType card = CardType.getCardTypes(cus1);
		// System.out.println("Card Name: " + card.getCardName());
	}
	

}
/*Ques - 4
-------------
Determining Card Type Based on Customer Spending
You are tasked with creating a system where a customer's spending determines their credit card type. The system involves two classes: Customer and CardType.

Classes:
Customer (BLC):

Attributes:
private: customerName (String) - The name of the customer.
private: monthlySpending (double) - The total amount spent by the customer in a month.

Methods:
setCustomerName(String name) - Sets the customer's name.
setMonthlySpending(double spending) - Sets the customer's monthly spending.
getCustomerName() - Returns the customer's name.
getMonthlySpending() - Returns the customer's monthly spending.
displayDetails() - Displays the customer’s details, including their name, monthly spending.

create another BLC class CardType:

Attributes:
private: cardName (String) - The name of the card ("Silver", "Gold", or "Platinum").
Methods:
getCardName()- returns the cardName.
getCardTypes(Customer customer) - A static method that takes a Customer
object as a parameter and returns a CardType object. This method should
initialize the cardName attribute based on the monthlySpending of the
customer, without using a constructor.
Spending < 10000: Silver
Spending 10000 - 50000: Gold
Spending > 50000: Platinum

Create an ELC class CustomerTester
In main Method:

Create an instance of the Customer class.
Set the customer's name and monthly spending using the setter methods.
Call the displayDetails() method to display the customer’s details.
Call the getCardTypes() method by sending an object of customer and print the card name.

Example:
Customer 1: Name: "John Doe", Monthly Spending: 7000
Card Type: Silver

Customer 2: Name: "Jane Smith", Monthly Spending:28000
Card Type: Gold

Customer 3: Name: "Alice Brown", Monthly Spending: 120000
Card Type: Platinum

 * /
 */