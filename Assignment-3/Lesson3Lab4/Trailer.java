package Lesson3Lab4;

public class Trailer extends Property{
    public static final double FACTOR = 500;

    public Trailer(Address address) {
        super(address);
    }

    @Override
    double computeRent() {
        return 1 * FACTOR;
    }
}
