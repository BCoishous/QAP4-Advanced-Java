package com.hospital;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {

    private static final String FILE_NAME = "drugs.txt";

    // Write a Drug object to the text file
    public void saveDrug(Drug drug) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
            writer.write(drug.toString());
            writer.newLine();
            writer.close();
            System.out.println("Drug saved to file successfully!");
        } catch (IOException e) {
            System.out.println("Error saving drug to file: " + e.getMessage());
        }
    }

    // Read all drugs from the text file and print them
    public void readDrugs() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            System.out.println("\n--- Drugs from File ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading drugs from file: " + e.getMessage());
        }
    }
}