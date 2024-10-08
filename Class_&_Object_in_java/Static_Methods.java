class Mobile {
    String brand;
    int price;
    static String name;

    // Similar to constructor
    static {
        name = "Phone";
        System.out.println("In static block");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    public void show() {
        System.out.println(brand + ": " + price + ": " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + ": " + obj.price + ": " + name);
    }
}

public class Static_Methods {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1200;
        Mobile.name = "SmartPhone";
        Mobile obj2 = new Mobile();
        obj2.brand = "Oppo";
        obj2.price = 1300;
        Mobile.name = "SmartPhone";

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}