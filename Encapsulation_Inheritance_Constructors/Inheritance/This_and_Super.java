package Inheritance;

class A {
    public A() {
        super(); // Bc iska super class konsa hai?? Ans:- Every class in Java extends Object
                 // class alwayssss
        System.out.println("In A");
    }

    public A(int n) {
        System.out.println("In A int");
    }
}

class B extends A {
    // Every constructor in a class has super() method toh parent ka bhi call hoga
    // automatically(Calls constructor of default parent class)
    public B() {
        super(); // Ye hota hi hai likho yaa nahi
        System.out.println("In B");
    }

    public B(int n) {
        this(); // Calls constructor of same class
        // super(n); // call parameterized constructor of A()
        System.out.println("In B int");
    }
}

public class This_and_Super {
    public static void main(String[] args) {
        new B(5); // Anonymous class(Can be used only once)
    }
}
