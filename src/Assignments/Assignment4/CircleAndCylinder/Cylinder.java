package Assignments.Assignment4.CircleAndCylinder;

public class Cylinder extends Circle{
    private double height= 1.0;

    public Cylinder() {
        super();
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    private double baseArea=super.getArea();

    public double getBaseArea() {
        return baseArea;
    }


    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*(getRadius()+height);
    }
}
