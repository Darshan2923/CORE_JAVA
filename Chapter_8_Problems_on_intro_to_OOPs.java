class Employee {
    int Salary;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Square {
    int side;

    public void setSide(int side) {
        this.side = side;
    }

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }

}

public class Chapter_8_Problems_on_intro_to_OOPs {
    public static void main(String[] args) {
        // Create a class Empployee with the following properties and methods:(See above
        // this class to see the Employee class)
        Employee e1 = new Employee();
        e1.setName("Ramu");
        System.out.println(e1.getName());
        e1.setSalary(10000);
        System.out.println(e1.getSalary());

        // Create a class cellPhone with methods to print "ringing","vibrating",etc.
        // similar to above employee class do as a (H.W.)

        // Create a square with a method to initialize its side, calculating area,
        // perimeter,etc.
        Square s1 = new Square();
        s1.setSide(4);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());

        // Create a class TommyVecetti for Rockstar Games capable of hitting(print
        // hitting),running,firing,etc.
        // Very similar to Employee class made earlier (H.W.)

        // ThankYou

    }
}
