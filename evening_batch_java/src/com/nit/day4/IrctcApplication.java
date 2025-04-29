package com.nit.day4;

import java.util.Scanner;

/**
 * Design an application representing real time Irctc Functionalities in which
 * user will be allowed to login in to account,after select destination , select
 * source station,select date, and book the ticket for some number of passengers
 * , once the ticket is booked successfully display the complete details with
 * readable messages.
 * 
 * ===analyzing=== variables ->
 * uid,pwd,source,destination,date,noOfPassengers,..,... methods ->
 * login(),bookTicket(),displayticketDetails()....,.
 * 
 * 
 * Store the multiple users and allot them seats randomly display the details of
 * each user along with which seat is allocated to the user:
 */

class InvalidCredentialsException extends Exception {

	public InvalidCredentialsException(String msg) {
		super(msg);

	}

}

class Irctc {

	private String uid, pwd, destination, source, date, passengerName, passengerGender;
	private int noOfPassengers, passengerAge;

	public String getUid() {

		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	// updating adding some more variables like passengerName,age,gender,and
	// displaying:

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerGender() {
		return passengerGender;
	}

	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public void login(String uid, String pwd, Scanner sc) throws InvalidCredentialsException {

		if (uid.equals("user123") && pwd.equals("asdf")) {
			System.out.println("Login Is Successful");

			System.out.println("Enter the Source: ");
			setSource(sc.nextLine());

			System.out.println("Enter the Destination: ");
			setDestination(sc.nextLine());

			System.out.println("Enter the Date: ");
			setDate(sc.nextLine());

			System.out.println("Enter the number of passengers: ");
			setNoOfPassengers(sc.nextInt());
			sc.nextLine();
			System.out.println("Add the passengers details: ");

			System.out.println("-----------------");
			System.out.println("Enter passenger Name: ");
			setPassengerName(sc.nextLine());

			System.out.println("Enter the passenger Gender: ");
			setPassengerGender(sc.nextLine());

			System.out.println("Enter passenger Age: ");
			setPassengerAge(sc.nextInt());

			System.out.println("\n");
			bookTicket(this);

		} else {
			throw new InvalidCredentialsException("You Entered Wrong Uid or Password | Try Again ");
		}

	}

	private void bookTicket(Irctc irctc) {
		// TODO -> we need to develop this functionally

		System.out.println("Successfully booked the ticket: " + "\n");

		// updating the functionality
		System.out.println("The Ticket details are: " + "\n");
		System.out.println("--------------------------------------");
		System.out.println("you selected source station  is: " + irctc.getSource());
		System.out.println("you selected destination  is: " + irctc.getDestination());
		System.out.println("you selected date is: " + irctc.getDate());
		System.out.println("you enterd no.of passengers: " + irctc.getNoOfPassengers() + "\n");
		System.out.println("-------------------------");
		System.out.println("you provided the passenger details are:");
		System.out.println("-------------------------");
		System.out.println("you provided passenger Name: " + irctc.getPassengerName());
		System.out.println("you provided passenger Age: " + irctc.getPassengerAge());
		System.out.println("you provided passenger Gender: " + irctc.getPassengerGender());
		System.out.println("--------------------------------------" + "\n");
	}
}

public class IrctcApplication {

	public static void main(String[] args) throws InvalidCredentialsException {

		Scanner sc = new Scanner(System.in);

		Irctc i1 = new Irctc();
		while (true) {

			System.out.println("Enter the user Id: ");
			i1.setUid(sc.nextLine());

			System.out.println("Enter the password: ");
			i1.setPwd(sc.nextLine());

			try {
				i1.login(i1.getUid(), i1.getPwd(), sc);
				break;

			} catch (InvalidCredentialsException e) {
				System.err.println(e.getMessage());
			}
		}

	}
}
