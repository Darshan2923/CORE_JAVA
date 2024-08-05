class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Disco");
    }
}

public class Throws_Exception {
    static {
        System.out.println("Class loaded");
    }

    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (Exception e) {
            System.out.println("Nai mil raha class..." + e);
        }
    }
}
