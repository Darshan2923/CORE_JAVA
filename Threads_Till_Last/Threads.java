class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hi");
            try {

                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hell        55654545434o");
            try {

                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);

        System.out.println(t1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        obj2.start();
    }
}
