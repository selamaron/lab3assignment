package Lesson3Lab2;

import java.util.ArrayList;

public class Building {

    private double maintenanceCost;
    private ArrayList<Apartment> apartments = new ArrayList<Apartment>();

    public Building(double maintenanceCost, ArrayList<Apartment> apartments) {
        this.maintenanceCost = maintenanceCost;
        this.apartments = apartments;
    }

    public double generateProfit(){
        double profit = 0.0;
        for (Apartment apartment : apartments) {
            profit += apartment.getRent();
        }
        return profit - maintenanceCost;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public ArrayList<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(ArrayList<Apartment> apartments) {
        this.apartments = apartments;
    }
}
