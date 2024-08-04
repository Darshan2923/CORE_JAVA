import Inheritance.*;

public class Inheritance_main {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.subtract(7, 3);
        int r3 = obj.multi(7, 3);
        int r4 = obj.div(7, 3);
        int r5 = obj.power(7, 3);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    }
}
