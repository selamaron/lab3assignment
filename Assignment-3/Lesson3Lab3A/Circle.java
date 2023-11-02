package Lesson3Lab3A;

public class Circle extends Cylinder {

    private double radius;

    Circle (double radius){
        super(radius, radius);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double computeArea(){
        //Compute area
        return Math.PI*(radius*radius);
    }

}
