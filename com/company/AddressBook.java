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


    public void details(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your First Name");
            String FirstName = input.nextLine();
            System.out.println("Enter your Last Name");
            String LastName = input.nextLine();
            System.out.println("Enter your Address");
            String Address = input.nextLine();
            System.out.println("Enter your Zip Code");
            int Zip = input.nextInt();
            System.out.println("Enter your City name");
            String City = input.next();
            System.out.println("Enter your State name");
            String State = input.next();
            System.out.println("Enter your Phone number");
            int PhoneNumber = input.nextInt();
            System.out.println("Enter your e-mail address");
            String Email = input.next();
            System.out.println("First Name: " + FirstName);
            System.out.println("Last Name: " + LastName);
            System.out.println("Address is : " + Address);
            System.out.println("Zip code: " + Zip);
            System.out.println("City Name: " + City);
            System.out.println("State name: " + State);
            System.out.println("Phone Number: " + PhoneNumber);
            System.out.println("E-Mail: " + Email);
        }
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book");
        AddressBook contacts = new AddressBook();
        contacts.details();
    }
}