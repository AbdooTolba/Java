package sheetOOP;

/**
 * Circle
 */
public class Circle {

    
    private double radius;
    
    public Circle() {
        this.radius = 1;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    // getCircumference
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    }
    
}