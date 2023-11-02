package Lesson3Lab4;

public abstract class Property {
    private double rent;
    private Address address;
    abstract double computeRent();

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Property(Address address) {
        this.address = address;
    }
}
