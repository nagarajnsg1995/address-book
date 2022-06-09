package com.bridgelabz;
import java.util.Scanner;
public class AddressBook {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        Contact contact = addContact();
        System.out.println(contact);
        Contact editedContact = editContact(contact);
        System.out.println(editedContact);
    }

    private static Contact addContact() {
        Contact contact = new Contact();
        System.out.println("Enter first name:");
        contact.setFirstName(scanner.next());
        System.out.println("Enter last name:");
        contact.setLastName(scanner.next());
        System.out.println("Enter address:");
        contact.setAddress(scanner.next());
        System.out.println("Enter city");
        contact.setCity(scanner.next());
        System.out.println("Enter zip");
        contact.setZip(Integer.parseInt(scanner.next()));
        System.out.println("Enter mobile");
        contact.setMobile(Integer.parseInt(scanner.next()));
        System.out.println("Enter email number");
        contact.setEmail(scanner.next());
        return contact;
    }
    private static Contact editContact(Contact contact) {
        System.out.println("Edit first name");
        contact.setFirstName(scanner.next());

        return contact;
    }
}