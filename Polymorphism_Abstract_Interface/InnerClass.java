class A {
    int age;

    public void show() {
        System.out.println("In show");
    }

    class B {
        public void config() {
            System.out.println("In config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        // A.B obj1 = obj.new B();
        // obj1.config();

        // Anonymous class

        // We can also implement abstract class using inner class for only once
        // implementation- Lec-66
        A obj = new A() {
            public void show() {
                System.out.println("In new show");
            }
        };
        obj.show();

    }
}
