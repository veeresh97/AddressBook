package com.company;

import java.util.Scanner;

public class AddressBook {
    private String FirstName;
    private String LastName;
    private String Address;
    private int Zip;
    private String City;
    private String State;
    private int PhoneNumber;
    private String Email;

    public AddressBook(String FirstName, String LastName, String Address, String City, int Zip,
                           String State, int PhoneNumber, String Email) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Zip = Zip;
        this.City = City;
        this.State = State;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }

    public AddressBook() {

    }
        public String[] details() {
            Scanner input = new Scanner(System.in);
            String[] contact = new String[8];
            System.out.println("Enter your First Name");
            String Firstname = input.nextLine();
            contact[0] = Firstname;
            System.out.println("Enter your Last Name");
            String LastName = input.nextLine();
            contact[1] = LastName;
            System.out.println("Enter your Address");
            String Address = input.nextLine();
            contact[2] = Address;
            System.out.println("Enter your Zip code");
            String Zip = input.next();
            contact[3] = Zip;
            System.out.println("Enter your City name");
            String City = input.next();
            contact[4] = City;
            System.out.println("Enter your State name");
            String State = input.next();
            contact[5] = State;
            System.out.println("Enter your Phone number");
            String PhoneNumber = input.next();
            contact[6] = PhoneNumber;
            System.out.println("Enter your e-mail address");
            String Email = input.next();
            contact[7] = Email;
            return contact;
        }
    public void edit(String[] contact) {
        System.out.println("If you want to edit then press 1 else press 0");
        Scanner sc = new Scanner(System.in);
        int read = sc.nextInt();
        if (read == 1) {
            System.out.println("Press the respective number you want to edit\n1  First Name\n2 Last Name\n3 Address\n4 Zip code\n5 City\n6 state\n7 phone number\n8 email");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter your new First Name");
                    String newFirstName = sc.next();
                    contact[0] = newFirstName;
                    break;
                case 2:
                    System.out.println("Enter your new Last Name");
                    String newLastName = sc.next();
                    contact[1] = newLastName;
                    break;
                case 3:
                    System.out.println("Enter your new Address");
                    String newAddress = sc.next();
                    contact[2] = newAddress;
                    break;
                case 4:
                    System.out.println("Enter your new Zip code");
                    String newZip = sc.next();
                    contact[3] = newZip;
                    break;
                case 5:
                    System.out.println("Enter your new city name");
                    String newCity = sc.next();
                    contact[4] = newCity;
                    break;
                case 6:
                    System.out.println("Enter your new State name");
                    String newState = sc.next();
                    contact[5] = newState;
                    break;
                case 7:
                    System.out.println("Enter your new Phone number");
                    String newPhoneNumber = sc.next();
                    contact[6] = newPhoneNumber;
                    break;
                case 8:
                    System.out.println("Enter your new email");
                    String newEmail = sc.next();
                    contact[7] = newEmail;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.println("Your new details are as follows");
            for (int j = 0; j < contact.length; j++) {
                System.out.println(contact[j]);
            }
        }
        else if (read == 0) {
            for (int j = 0; j < contact.length; j++) {
                System.out.println(contact[j]);
            }

        }
        else
            System.out.println("Invalid Input");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book");
        AddressBook contacts = new AddressBook();
        String[] info = contacts.details();
        contacts.edit(info);
    }
}