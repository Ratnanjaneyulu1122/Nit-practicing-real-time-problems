package com.nit.day9;

import java.util.ArrayList;
import java.util.List;

class invalidInputException extends Exception{
	
}
class Employee {
	private String employeeName;
	private String department;
	private double baseSalary;
	private int performanceScore;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int socre() {
		return performanceScore;
	}

	public void setPerformance(int performance) {
		this.performanceScore = performance;
	}

	
	public double calculateBonus() throws invalidInputException {

		double bonus = 0.0;
		if (performanceScore < 5) {

			bonus = 0.0;
			System.out.println("no bonus because your score is less than 5:");
		} else if (performanceScore >= 5 && performanceScore <= 7) {
			bonus = (0.10 * baseSalary);

		} else if (performanceScore > 8 && performanceScore <= 10) {

			bonus = (0.20 * baseSalary);

		} else {
			throw new invalidInputException();
		}

		return bonus;

	}

}
public class EmpBonusCalMain {

	public static void main(String[] args) throws invalidInputException {
		// not relay this now but upgrading our application code into a new level
		ArrayList<Employee> emplist = new ArrayList<Employee>();

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		e1.setEmployeeName("hari");
		e1.setDepartment("dev");
		e1.setBaseSalary(34000);
		e1.setPerformance(8);

		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);

		for (Employee employee : emplist) {
			System.out.println(employee.toString());
		}

	}
}

/*
 * Ques - 2 ----------- 
 * Employee Performance Evaluation You need to create a
 * class that models an Employee in a performance evaluation system. The
 * Employee class should have the following attributes:
 * 
 * Class name: Employee(BLC)
 * -------------- 
 * Attributes:
 * private: employeeName (String) private: department (String) private:
 * baseSalary (double) private: performanceScore (int) - a score between 1 and
 * 10 representing the employee's performance. The performance score affects the
 * employee's bonus. The bonus is calculated as:
 * 
 * Implement below methods:
 * 
 * Method name: calculateBonus() return type: double modifiers: public Logic: If
 * the performance score is between 8 and 10, the bonus is 20% of the base
 * salary. If the performance score is between 5 and 7, the bonus is 10% of the
 * base salary. If the performance 
 * score is below 5, there is no bonus. After
 * calculating return the bonus.
 * 
 * Implement public setter methods to initialize each of these attributes.
 * 
 * Implement public getter methods to retrieve the values of these attributes
 * 
 * Create an ELC class EmployeeTester Write a main method to: Create an instance
 * of the Employee class. Initialize the attributes using setters. Calculate and
 * print the bonus with employee name, department, baseSalary by using getters.
 */
