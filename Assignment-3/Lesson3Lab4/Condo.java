package Lesson3Lab4;

public class Condo extends Property{
    private static final double FACTOR = 400;
    private double numOfFloors;

    public Condo(double numOfFloors, Address address) {
        super(address);
        this.numOfFloors = numOfFloors;
    }

    @Override
    double computeRent() {
        return numOfFloors * FACTOR;
    }
}
