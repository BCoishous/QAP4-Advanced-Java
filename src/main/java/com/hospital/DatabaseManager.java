package com.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseManager {

    private static final String URL = "jdbc:postgresql://localhost:5432/hospital_db";
    private static final String USER = "brandoncoish";
    private static final String PASSWORD = "";

    // Establish a connection to the database
    private Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Insert a Patient into the database
    public void savePatient(Patient patient) {
        String sql = "INSERT INTO patients (patient_first_name, patient_last_name, patient_dob) VALUES (?, ?, ?)";
        try {
            Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, patient.getPatientFirstName());
            stmt.setString(2, patient.getPatientLastName());
            stmt.setString(3, patient.getPatientDOB());
            stmt.executeUpdate();
            conn.close();
            System.out.println("Patient saved to database successfully!");
        } catch (SQLException e) {
            System.out.println("Error saving patient: " + e.getMessage());
        }
    }

    // Read all patients from the database and print them
    public void readPatients() {
        String sql = "SELECT * FROM patients";
        try {
            Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            System.out.println("\n--- Patients from Database ---");
            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("patient_id") +
                    " | First Name: " + rs.getString("patient_first_name") +
                    " | Last Name: " + rs.getString("patient_last_name") +
                    " | DOB: " + rs.getString("patient_dob")
                );
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error reading patients: " + e.getMessage());
        }
    }
}