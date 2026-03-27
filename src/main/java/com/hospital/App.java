package com.hospital;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();
        DatabaseManager dbManager = new DatabaseManager();

        boolean running = true;

        while (running) {
            System.out.println("\n=== Hospital Management System ===");
            System.out.println("1. Save a Drug to file");
            System.out.println("2. Read all Drugs from file");
            System.out.println("3. Save a Patient to database");
            System.out.println("4. Read all Patients from database");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Drug ID: ");
                    int drugId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Drug Name: ");
                    String drugName = scanner.nextLine();
                    System.out.print("Enter Drug Cost: ");
                    double drugCost = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Dosage: ");
                    String dosage = scanner.nextLine();
                    Drug drug = new Drug(drugId, drugName, drugCost, dosage);
                    fileManager.saveDrug(drug);
                    break;

                case 2:
                    fileManager.readDrugs();
                    break;

                case 3:
                    System.out.print("Enter Patient ID: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
                    String dob = scanner.nextLine();
                    Patient patient = new Patient(patientId, firstName, lastName, dob);
                    dbManager.savePatient(patient);
                    break;

                case 4:
                    dbManager.readPatients();
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}