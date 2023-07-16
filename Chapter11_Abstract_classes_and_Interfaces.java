abstract class Phone {
    abstract void switchOff();

    void moveTo(double X, double Y) {
        System.out.println(X);
        System.out.println(Y);
    }
}

class MobilePhone extends Phone {
    @Override
    void switchOff() {
        // Provide implementation for switchOff() method
    }
}

interface Bicycle {
    void applyBrakes(int decrement);

    void speedUp(int increment);
}

class AvonCycle implements Bicycle {
    int speed = 7;

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }
}

public class Chapter11_Abstract_classes_and_Interfaces {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.switchOff();
        mobilePhone.moveTo(10.5, 20.5);
        // If a subclass extends the abstract class it needs to make itself an abstract
        // class or implement the funstions of the parent abstract class.

        // Interfaces in Java
        // Interface in java is a group of related methods with empty bodies.

        // Next UP... Interfaces v/s Abstract classes and default methods.

    }
}
