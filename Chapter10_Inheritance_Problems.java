// Circle class
class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Cylinder class inheriting from Circle
class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}

// Rectangle class
class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }
}

// Cuboid class inheriting from Rectangle
class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}

public class Chapter10_Inheritance_Problems {
    public static void main(String[] args) {
        // 1.Create a class Circle and use inheritance to create another class cylinder
        // from it.
        // See above this class
        Cylinder cylinder = new Cylinder(3.0, 10.0);
        System.out.println("Cylinder radius: " + cylinder.getRadius());
        System.out.println("Cylinder height: " + cylinder.getHeight());
        System.out.println("Cylinder volume: " + cylinder.getVolume());

        // 2. Create a class Rectangle and use inheritance to create another class
        // cuboid.Try to keep it as close to real world scenario as possible.
        // See above this class.
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle length: " + rectangle.getLength());
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle area: " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5.0, 3.0, 2.0);
        System.out.println("Cuboid length: " + cuboid.getLength());
        System.out.println("Cuboid width: " + cuboid.getWidth());
        System.out.println("Cuboid height: " + cuboid.getHeight());
        System.out.println("Cuboid volume: " + cuboid.getVolume());

        // 3.Create methods area and volume for the above question
        // Easy hai do on your own.

        // 4.Create methods for area and volume in above.Also create getters and
        // setters.
        // HW.
    }
}
