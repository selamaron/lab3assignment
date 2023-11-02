package Lesson3Lab3B;

public class Circle {

    private double radius;

    Circle (double radius){
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
