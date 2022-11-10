
/**
 * Rectangle
 */

public class Rectangle {
    
    private float length;
    private float width;
    
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }
    
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    
    public float getLength() {
        return this.length;
    }
    
    public void setLength(float length) {
        this.length = length;
    }
    
    public float getWidth() {
        return this.width;
    }
    
    public void setWidth(float width) {
        this.width = width;
    }
    
    public float getArea() {
        return this.length * this.width;
    }
    
    public float getPerimeter() {
        return 2 * (this.length + this.width);
    }
    
    @Override
    public String toString() {
        return "Rectangle[length=" + this.length + ", width=" + this.width + "]";
    }
    
}