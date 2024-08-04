class A {
    public void show() {
        System.out.println("In A");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B");
    }
}

public class Dynamic_Dispatch {
    public static void main(String[] args) {
        // A obj = new B();
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();
    }
}
