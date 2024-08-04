class A {
    public void show1() {
        System.out.println("In A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In B");
    }
}

public class UpCasting_DownCasting {
    public static void main(String[] args) {
        A obj = (A) new B(); // Upcasting
        obj.show1();

        B obj1 = (B) obj; // Downcasting
        obj1.show2();
    }
}
