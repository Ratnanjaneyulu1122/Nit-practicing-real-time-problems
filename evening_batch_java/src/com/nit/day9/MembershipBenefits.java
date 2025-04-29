package com.nit.day9;

class User {
	private String username, membershipStatus;
	private double purchaceAmount;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMembershipStatus() {
		return membershipStatus;
	}

	public void setMembershipStatus(String membershipStatus) {
		this.membershipStatus = membershipStatus;
	}

	public double getPurchaceAmount() {
		return purchaceAmount;
	}

	public void setPurchaceAmount(double purchaceAmount) {
		this.purchaceAmount = purchaceAmount;
	}

	public void displayDiscount() {
		// displayDiscount(): void - Displays the user's name, purchase amount.

		System.out.println("User Name: " + getUsername());
		System.out.println("Purchace Amount: " + getPurchaceAmount());
		System.out.println("Membership Status:" + getMembershipStatus());

	}

	// applyDiscount(Discount discount) - Calculates and prints the final price and
	// discount %, after applying the discount.
	public void applyDiscount(Discount discount) {
		double finalPrice = getPurchaceAmount() - (getPurchaceAmount() * discount.getDiscountpercentage() / 100);
		System.out.println("the Final price: " + finalPrice);
	}

}

class Discount {
	private double discountpercentage;

	public double getDiscountpercentage() {
		return discountpercentage;
	}

	public static Discount getDiscount(User user) {
		Discount discount = new Discount();
		String membershipStatus = user.getMembershipStatus();
		double purchaseAmount = user.getPurchaceAmount();
		/*
		 * Logic: If the user’s membership status is "Regular": If the purchase amount
		 * is less than 100, set the discount percentage to 5.0%. If the purchase amount
		 * is between 100 and 500 (inclusive), set the discount percentage to 10.0%. If
		 * the purchase amount is greater than 500, set the discount percentage to
		 * 15.0%./
		 */

		if (membershipStatus.equals("Regular")) {
			if (purchaseAmount < 100) {
				discount.discountpercentage = 0.05;
			} else if (purchaseAmount > 100 && purchaseAmount <= 500) {
				discount.discountpercentage = 0.10;

			} else if (purchaseAmount > 500) {
				discount.discountpercentage = 0.15;

			}
		}
		if (membershipStatus.equals("Silver")) {
			if (purchaseAmount < 100) {
				discount.discountpercentage = 0.10;
			} else if (purchaseAmount > 100 && purchaseAmount <= 500) {
				discount.discountpercentage = 0.15;

			} else if (purchaseAmount > 500) {
				discount.discountpercentage = 0.20;

			}
		}

		if (membershipStatus.equals("Gold")) {
			if (purchaseAmount < 100) {
				discount.discountpercentage = 0.15;
			} else if (purchaseAmount > 100 && purchaseAmount <= 500) {
				discount.discountpercentage = 0.20;

			} else if (purchaseAmount > 500) {
				discount.discountpercentage = 0.25;

			}
		}

		return discount;

	}
}

public class MembershipBenefits {

	/*
	 * Create an instance of the User class. Set the user's name, purchase amount,
	 * and membership status using setter methods. Call the displayDiscount() method
	 * to display the user's details along with the calculated discount. Call the
	 * getDiscount(User user) method to get the Discount object with
	 * discountPercentage, by passing User object. Call the applyDiscount(Discount)
	 * method to display the final price after applying the discount./
	 */
	public static void main(String[] args) {
		User user1 = new User();
		user1.setUsername("hai");
		user1.setPurchaceAmount(550);
		user1.setMembershipStatus("Silver");
		user1.displayDiscount();
		System.out.println("Discount: " + Discount.getDiscount(user1).getDiscountpercentage());
		user1.applyDiscount(Discount.getDiscount(user1));
		
		
		User user2 = new User();
		user2.setUsername("Alice");
		user2.setPurchaceAmount(150);
		user2.setMembershipStatus("Silver");
		user2.displayDiscount();
		System.out.println("Discount: " + Discount.getDiscount(user1).getDiscountpercentage());
		user2.applyDiscount(Discount.getDiscount(user1));
	}

}
/*
 * Ques - 5
-----------
Membership Benefits Based on Customer Spending with Discount Application:
You are tasked with creating a system to determine discounts for products based on the total purchase amount and membership status of a user. The system involves two classes: User and Discount.

Classes:
class User (BLC):

Attributes (all are private):
userName (String) - The name of the user.
purchaseAmount (double) - The total amount spent by the user on a purchase.
membershipStatus (String) - The membership status of the user ("Regular", "Silver", "Gold").

Methods:
setUserName(String name): void - Sets the user's name.
setPurchaseAmount(double amount): void - Sets the total purchase amount.
setMembershipStatus(String status): void - Sets the membership status.
getUserName(): String - Returns the user's name.
getPurchaseAmount(): double - Returns the total purchase amount.
getMembershipStatus(): String - Returns the membership status.

displayDiscount(): void - Displays the user's name, purchase amount.

applyDiscount(Discount discount) - Calculates and prints the final price and discount  %, after applying the discount.

class Discount (BLC):

Attributes (all are private):
discountPercentage (double) - The percentage of discount applied.

Methods:
getDiscountPercentage() - Returns the discount percentage.
getDiscount(User user) - A static method that takes a User object as a parameter and returns a Discount object. This method should initialize the discountPercentage attribute based on the user's purchaseAmount and membershipStatus.
Logic:
If the user’s membership status is "Regular":
If the purchase amount is less than 100, set the discount percentage to 5.0%.
If the purchase amount is between 100 and 500 (inclusive), set the discount percentage to 10.0%.
If the purchase amount is greater than 500, set the discount percentage to 15.0%.

If the user’s membership status is "Silver":
If the purchase amount is less than 100, set the discount percentage to 10.0%.
If the purchase amount is between 100 and 500 (inclusive), set the discount percentage to 15.0%.
If the purchase amount is greater than 500, set the discount percentage to 20.0%.

If the user’s membership status is "Gold":
If the purchase amount is less than 100, set the discount percentage to 15.0%.
If the purchase amount is between 100 and 500 (inclusive), set the discount percentage to 20.0%.
If the purchase amount is greater than 500, set the discount percentage to 25.0%.

Create an ELC class UserTest:
In Main Method:

Create an instance of the User class.
Set the user's name, purchase amount, and membership status using setter methods.
Call the displayDiscount() method to display the user's details along with the calculated discount.
Call the getDiscount(User user) method to get the Discount object with discountPercentage, by passing User object.
Call the applyDiscount(Discount) method to display the final price after applying the discount.

Example Ouput:
User 1: Name: "Alice", Purchase Amount: 150, Membership Status: "Silver"
Discount: 15%
Final Price: 127.50

User 2: Name: "Bob", Purchase Amount: 600, Membership Status: "Gold"
Discount: 25
Final Price: 450.00

User 3: Name: "Charlie", Purchase Amount: $80, Membership Status: "Regular"
Discount: 5%
Final Price: 76.00/
 */