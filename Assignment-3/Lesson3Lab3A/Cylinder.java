package Lesson3Lab3A;

public class Cylinder {
    private double height;
    private double radius;

    Cylinder(double radius, double height){
        this.height = height;
        this.radius = radius;
    }
    public double getHeight(){
        return this.height;
    }
    public double computeVolume(){
        //Formula to compute volume
        return Math.PI*(radius*radius)*height;
    }
}
