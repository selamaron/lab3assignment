package Lesson3Lab2;

import java.util.ArrayList;

public class Landlord {

    private ArrayList<Building> buildings = new ArrayList<>();

    public Landlord(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public double calculateMonthlyProfit(){
        double monthlyProfit = 0.0;
        for (Building building : buildings) {
            monthlyProfit += building.generateProfit();
        }
        return monthlyProfit;
    }


    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

}
