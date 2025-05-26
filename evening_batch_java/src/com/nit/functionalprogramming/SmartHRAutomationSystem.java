package com.nit.functionalprogramming;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employees {
	private String name;
	private String email;
	private String designation;
	private double salary;
	private double performanceRating;

	public Employees(String name, String email, String designation, double salary, double performanceRating) {
		this.name = name;
		this.email = email;
		this.designation = designation;
		this.salary = salary;
		this.performanceRating = performanceRating;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setPerformanceRating(double rating) {
		this.performanceRating = rating;
	}

	public double getPerformanceRating() {
		return performanceRating;
	}

	@Override
	public String toString() {
		return "Employee : [name=" + name + ",email=" + email + ",designation=" + designation + ",salary=" + salary
				+ ",Performance Rating=" + performanceRating + "]";
	}
}

public class SmartHRAutomationSystem {

	public static void checkEligibleBonus(ArrayList<Employees> employees, Predicate<Employees> p) {

		boolean isFound = false;
		for (Employees emp : employees) {
			if (p.test(emp)) {
				isFound = true;
				System.out.println(emp);
			}
		}
		if (isFound != true) {

			System.out.println("No Employees are Eligible for bonus");

		}

	}

	public static void main(String[] args) {

		ArrayList<Employees> employees = new ArrayList<>();
		employees.add(new Employees("Rajesh", "rajesh@123", "Developer", 30000, 6.3));
		employees.add(new Employees("hari", "Hari@321", "Architech", 40000, 8.3));
		employees.add(new Employees("Ram", "ram@123", "Developer", 30000, 9.2));
		employees.add(new Employees("kalyan", "kalyan@123", "Devops", 30000, 8.4));
		employees.add(new Employees("mahesh", "mahesh@123", "Developer", 30000, 7.4));
		employees.add(new Employees("sandeep", "sandeep@123", "Developer", 30000, 7.8));

		// checkEligibleBonus(employees, (e) -> e.getPerformanceRating() > 8);
		calculateBonus(employees, e -> {
			Double bonus = null;
			if (e.getPerformanceRating() > 8) {
				bonus = e.getSalary() * 0.10;
				// System.out.println("Bonus"+bonus);
			}

			return bonus;
		});

	}

	private static void calculateBonus(ArrayList<Employees> emplist, Function<Employees, Double> f) {

		for (Employees employee : emplist) {
			if (f.apply(employee) != null) {
				System.out.println("You’ve received a bonus of " + f.apply(employee));
				System.out.println(employee);
			}
		}

	}

}

/*
----------------------------------
 * Your company is building a Smart HR System that:
- Filters eligible employees for bonuses.  ->predicate
- Calculates bonuses based on their ratings. ->function
- Notifies them with custom messages.   ->supplier
- Generates congratulatory messages using suppliers.
---------------------------------------------
Expected Output:
Notification Sent: Anjali, congratulations! You’ve received a bonus of ₹8000.0
Notification Sent: Rohit, congratulations! You’ve received a bonus of ₹7500.0
Neha is not eligible for a bonus.
Kiran is not eligible for a bonus.
HR SYSTEM: Bonus processing completed!
--------------------/
 Function<Employees, Double> f1 = (e) -> {
			Double bonus = null;
			if (e.getPerformanceRating() > 8) {
				bonus = e.getSalary() * 0.10;
				//System.out.println("Bonus"+bonus);
			}

			return bonus;
		};
		for (Employees employees2 : employees) {
			if (f1.apply(employees2) != null) {
				System.out.println("You’ve received a bonus of "+f1.apply(employees2));
				System.out.println(employees2);
			}
		}
	------------------------------------------
 */