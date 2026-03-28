# QAP 4 - Hospital Management System

## Project Description

A Java console application that demonstrates two methods of data persistence:

- Writing Drug data to a **text file** using Java File I/O
- Writing Patient data to a **PostgreSQL database** using JDBC

## How It Works

The app presents a menu with 4 options:

1. Save a Drug to a text file
2. Read all Drugs from the text file
3. Save a Patient to the PostgreSQL database
4. Read all Patients from the database

## Technologies Used

- Java 25
- Maven
- PostgreSQL
- JDBC (PostgreSQL Driver 42.7.3)
- pgAdmin

## How to Run

1. Clone the repository
2. Create the database by running `create_tables.sql` in pgAdmin on a database called `hospital_db`
3. Update the username in `DatabaseManager.java` to match your PostgreSQL username
4. Run the app with:

```bash
mvn compile exec:java -Dexec.mainClass="com.hospital.App"
```

## Project Summary

1. I estimate the project was about 5 hours to completion.
2. For resources class lectures and notes were used. Youtube, Stack Overflow, Geeksforgeeks.
3. No help from classmates on this assignment. Some discussion about concepts.
4. No help outside class hours from instructors.
