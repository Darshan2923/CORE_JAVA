public class Chapter_07_OOPs_in_java {
    public static void main(String[] args) {
        // Object Oriented Programming tries to map code instructions with real world
        // making the code short and easier to understand.
        // Solving a problem by creating objects in one of the most popular approaches
        // in programming. This is called Object Oriented Programming.

        // OOPs Terminology
        // 1.Abstraction---> Hiding inernal details(show only essential info)
        // Example. 1) Use the Phone you give your friend without bothering about how it
        // was made.
        // 2.Encapsulation---> The act of putting various components together(in a
        // capsule).
        // Example. 1) Laptop is a single entity with wifi+speaker+storage in a singal
        // box.
        // 3.Inheritance---> Act of deriving new things from existing. Example
        // Rickshaw-> E-Rickshaw
        // 4.Polymorphism---> One entity many forms.

        // Custom class in OOPs in Java
        // See at the below this class for the custom class "Employee"
        // Here is the instantiation of object of class employee
        Employee Darshan = new Employee();
        Darshan.id = 12;
        Darshan.name = "Darshan Yadav"; // setting properties
        System.out.println(Darshan.id);
        System.out.println(Darshan.name);

    }
}

class Employee {
    int id;
    String name;

    public void printDetails() {
        System.out.println("My id is: " + id);
        System.out.println("My name is: " + name);
    }
}
