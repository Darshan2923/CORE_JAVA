//1. and 2. 
class Cylinder {
    private double radius;
    private double height;

    public Cylinder() {
        this.radius = 1.0;
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
}

// 3.
class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }

    public int getPerimeter() {
        return 2 * (length + breadth);
    }
}

public class Chapter09_Problems_access_modifiers {
    public static void main(String[] args) {
        // 1.Create a class cylinder and use getters and setters to set its radius and
        // height.
        // see above this class
        // 2.Use above question to calculate surface area and volume of the cylinder.
        // see above this class
        // 3.Overload the constructor used too initialize a rectangle of length 4 and
        // breadth 5 for custom parameters.
        // see above the class.

    }
}