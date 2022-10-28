package com.address.book;

import java.util.Scanner;

public class AdressBook {
	Scanner sc = new Scanner(System.in);

	ContactPerson contact = new ContactPerson();

	public void addContact() {
		System.out.println("Enter your FirstName: ");
		contact.setFirstName(sc.next());
		System.out.println("Enter your LastName: ");
		contact.setLastName(sc.next());
		System.out.println("Enter your Email: ");
		contact.setEmail(sc.next());
		System.out.println("Enter your Address: ");
		contact.setAddress(sc.next());
		System.out.println("Enter your City: ");
		contact.setCity(sc.next());
		System.out.println("Enter your State: ");
		contact.setState(sc.next());
		System.out.println("Enter your Zipcode: ");
		contact.setZip(sc.nextInt());
		System.out.println("Enter your Mobile Number: ");
		contact.setMobile(sc.nextLong());
	}

	public void showContacts() {
		System.out.println(contact.toString());
	}

}
