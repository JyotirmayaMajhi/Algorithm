package com.bridgelabz.messagedemonstration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Message {

	private static Message instance;
	
	
	private Message() {
		
	}
	
	public static Message getInstance() {
		if(instance == null) {
			instance = new Message();
		}
		return instance;
		
	}
	
	public void input() {
		User user = User.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name : ");
		String fName = sc.next();
		user.setFirstName(fName);
		System.out.print("Enter Last Name : ");
		String lName = sc.next();
		user.setLastName(lName);

		addPhoneNumber();

	}

	public void addPhoneNumber() {
		User user = User.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Phone Number (Eg.91-9431295843) : ");
		String phoneNumber = sc.nextLine();
		boolean check = phoneNumber.matches("^([0-9]{1,2})-([0-9]{10})$");
		if (check == true) {
			user.setPhoneNumber(phoneNumber);

		} else {
			System.out.println("Invalid Phone Number format \nAdd again (Eg:91-9431295843)");
			addPhoneNumber();
		}
	}

	public void display() {

		User user = User.getInstance();
		System.out.println("Hello " + user.getFirstName() + ", We have your full name " + user.getFirstName() + " "
				+ user.getLastName() + " in our system. your contact number is " + user.getPhoneNumber() + ".\n"
				+ "Please,let us know in case of any clarification \nThank you BridgeLabz.\nDate  : " + date());

	}

	private String date() {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String formattedDate = date.format(dateFormat);
		return formattedDate;
	}
	
}
