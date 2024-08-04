abstract class A {
    public abstract void show();

    public abstract void config();
}

// is same as
interface Ax {
    int age = 44; // final and static
    String area = "Damn";

    void show();

    void config();
}

interface X {
    void run();
}

interface Y extends X {

}

class B implements Ax, Y {
    public void show() {
        System.out.println("Showing...");
    }

    public void run() {
        System.out.println("Running...");
    }

    public void config() {
        System.out.println("Config...");
    }

}

public class Interfaces {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.config();
    }
}
