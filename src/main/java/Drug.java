package com.hospital;

public class Drug {

    private int drugId;
    private String drugName;
    private double drugCost;
    private String dosage;

    // Constructor
    public Drug(int drugId, String drugName, double drugCost, String dosage) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.drugCost = drugCost;
        this.dosage = dosage;
    }

    // Getters
    public int getDrugId() { return drugId; }
    public String getDrugName() { return drugName; }
    public double getDrugCost() { return drugCost; }
    public String getDosage() { return dosage; }

    // Useful for printing a Drug object
    @Override
    public String toString() {
        return "Drug ID: " + drugId +
               " | Name: " + drugName +
               " | Cost: $" + drugCost +
               " | Dosage: " + dosage;
    }
}