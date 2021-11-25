package com.bridgelabz.messagedemonstration;

public class User {

	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	public static User instance;
	
	private User(){
		
	}
	
	public static User getInstance() {
		if(instance == null) {
			instance = new User();
		}
		return instance;
	}
	
		public String getFirstName() {
		return firstName;
		}

		public void setFirstName(String firstName) {
		this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		@Override
		public String toString() {
			return "UserData [firstName=" + firstName + ", lastName=" 
					+ lastName + ", phoneNumber=" + phoneNumber + "]";
		}
}


