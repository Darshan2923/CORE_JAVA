abstract class Car {
    public abstract void drive();

    public abstract void fly();
    // idea hai ki drive hoga but implement vo karega jo mujhe extend karega

    public void playMusic() {
        System.out.println("play music");
    }
}

abstract class WagonR extends Car {
    public void drive() {
        System.out.println("drive");
    }
}

class UpdatedWagonR extends WagonR {
    public void fly() {
        System.out.println("Flying...");
    }
}

public class Abstract_keyword {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
    }
}
