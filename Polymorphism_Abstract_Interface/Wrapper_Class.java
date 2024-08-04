public class Wrapper_Class {
    public static void main(String[] args) {
        // Java is not 100% object oriented due to presence of primitive datatypes.
        // Primitive datatypes dont have objects created which saves memory and time to
        // store them in heap.

        // So we have wrapper classes for each primitive datatypes

        // int-> Integer
        // char->Character
        // double->Double

        int num = 7;
        // Integer num1 = new Integer(8); // boxing
        Integer num1 = num; // auto-boxing

        int num2 = num1; // unboxing

        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num1);
        System.out.println(num3);
    }
}
