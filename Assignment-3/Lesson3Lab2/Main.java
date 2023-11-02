package Lesson3Lab2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Apartment apartment1 = new Apartment(500);
        Apartment apartment2 = new Apartment(800);
        Apartment apartment3 = new Apartment(900);
        Apartment apartment4 = new Apartment(600);

        ArrayList<Apartment> building1Apartments = new ArrayList<>();
        building1Apartments.add(apartment1);
        building1Apartments.add(apartment2);
        ArrayList<Apartment> building2Apartments = new ArrayList<>();
        building2Apartments.add(apartment3);
        building2Apartments.add(apartment4);

        Building building1 = new Building(150, building1Apartments);
        Building building2 = new Building(250, building2Apartments);

        ArrayList<Building> buildings = new ArrayList<>();
        buildings.add(building1);
        buildings.add(building2);

        Landlord landlord = new Landlord(buildings);
        System.out.println("Landlord monthly profit: $"+ landlord.calculateMonthlyProfit());
    }
}
