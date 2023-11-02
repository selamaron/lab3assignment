package Lesson3Lab3A;

public class Main {

    public static void main(String[] args) {
	Cylinder cylinder= new Cylinder(34.5, 50);
    Circle circle= new Circle(23.6);
    System.out.println("Cylinder: " +cylinder.computeVolume());
    System.out.println("Circle: " +circle.computeArea());
    }
}
