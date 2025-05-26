package com.nit.functionalprogramming;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	private String name, employeeDesignation, id;
	private double salary;
	private int weekdaysWorked;

	public Employee(String name, String employeeDesignation, String id, double salary, int daysWorked) {
		this.name = name;
		this.employeeDesignation = employeeDesignation;
		this.id = id;
		this.salary = salary;
		this.weekdaysWorked = daysWorked;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getEmployeeDesignation() {
		return employeeDesignation;
	}

	protected void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected double getSalary() {
		return salary;
	}

	protected void setSalary(double salary) {
		this.salary = salary;
	}

	protected int getDaysWorked() {
		return weekdaysWorked;
	}

	protected void setDaysWorked(int daysWorked) {
		this.weekdaysWorked = daysWorked;
	}

	@Override
	public String toString() {
		return "Employee : [name=" + name + ", employeeDesignation=" + employeeDesignation + ", id=" + id + ", salary="
				+ salary + ", daysWorked=" + weekdaysWorked + "]";
	}

}

public class EmployeeManagementSystem {
	public static void displayIf(ArrayList<Employee> emp, Predicate<Employee> p) {
		for (Employee employee : emp) {
			if (p.test(employee)) {
				System.out.println(employee);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		Employee e1 = new Employee("Rajesh", "Developer", "14ADevRaj", 8000, 5);
		Employee e2 = new Employee("Ramu", "Architech", "14AArchiGor", 10000, 6);
		Employee e3 = new Employee("Raghu", "Hr", "14AjHRRagu", 5300, 3);
		Employee e4 = new Employee("hari", "Devloper", "hari123", 6000, 4);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);

		// displayIf(emp, (e) ->
		// e.getEmployeeDesignation().equalsIgnoreCase("developer"));
		// displayIf(emp, (e) -> e.getSalary() < 8000);
		// displayIf(emp, (e) -> e.getDaysWorked() > 3);
		System.out.println("Name starts with h");
		displayIf(emp, (e) -> e.getName().startsWith("h"));
	}
}

/*
 * class Employee{ name,designation,salaray,worked, constructor,tostring,private
 * attributes,dynamic operation passing arraylist<employee>,lamba expressinon
 * receing as a argument .}
 * 
 * 
 * 
 */
