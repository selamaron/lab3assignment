package Lesson3Lab3B;

public class Cylinder {
    private double height;
    private Circle circle;

    Cylinder(double radius, double height){
        this.circle = new Circle(radius);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public double computeVolume(){
        //Formula to compute volume
        return this.circle.computeArea()*height;
    }
}
