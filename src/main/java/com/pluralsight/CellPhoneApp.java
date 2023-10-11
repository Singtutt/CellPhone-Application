package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
    public static void main(String[] args) {
        CellPhone myCellPhone = new CellPhone();
        Scanner scanner = new Scanner(System.in);

//  Prompt the user for cell phone information
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is the phone model? ");
        String model = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

//  Setters
        myCellPhone.setSerialNumber(serialNumber);
        myCellPhone.setModel(model);
        myCellPhone.setCarrier(carrier);
        myCellPhone.setPhoneNumber(phoneNumber);
        myCellPhone.setOwner(owner);

//  Getters
        System.out.println("\nCell Phone Information:");
        System.out.println("Serial Number: " + myCellPhone.getSerialNumber());
        System.out.println("Model: " + myCellPhone.getModel());
        System.out.println("Carrier: " + myCellPhone.getCarrier());
        System.out.println("Phone Number: " + myCellPhone.getPhoneNumber());
        System.out.println("Owner: " + myCellPhone.getOwner());

//  Close the scanner
        scanner.close();
    }
}