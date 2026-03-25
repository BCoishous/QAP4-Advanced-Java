CREATE TABLE patients (
    patient_id SERIAL PRIMARY KEY,
    patient_first_name VARCHAR(50) NOT NULL,
    patient_last_name  VARCHAR(50) NOT NULL,
    patient_dob        VARCHAR(20) NOT NULL
);