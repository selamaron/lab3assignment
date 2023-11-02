package Lesson3Lab4;

public class House extends Property{
    private static final double FACTOR = 0.1;
    private double lotSize;

    public House(double lotSize, Address address) {
        super(address);
        this.lotSize = lotSize;
    }

    @Override
    double computeRent() {
        return lotSize * FACTOR;
    }

}
