package sheetOOP;

// make a class extends class circle with double height and empty constructor and constructor with height and constructor with double radius and double height and method to get volume and override the toString function to return the details of cylinder 
public class Cylinder extends Circle {
    private double height;
    
    public Cylinder() {
        super();
        this.height = 1.0;
    }
    
    public Cylinder(double height) {
        super();
        this.height = height;
    }
    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume() {
        return getArea() * height;
    }
    
    @Override
    public String toString() {
        return "Cylinder: " + super.toString() + "and height=" + height;
    }
}