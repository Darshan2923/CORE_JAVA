import java.util.Scanner;

public class Chapter_1_Introduction_to_Java {
    public static void main(String[] args) {
        // Basic Hello World in Java
        System.out.println("Hello World");

        // Variables in Java
        // Variables are containers that stores data, Java is statically typed
        int number = 8;
        System.out.println(number);

        // Datatypes and literals
        int num = 0;
        boolean guess = false;
        float f1 = 5.46f; // Here f after the number is the literal
        double d1 = 783846.38926482;
        long l1 = 783675628;
        char c1 = 'A';
        String Darshan = "Darshan"; // String is not a primitive datatype but java has special support for the same.
        short s1 = 27;
        byte b1 = 127;
        System.out.print(num + " ");
        System.out.print(guess + " ");
        System.out.print(f1 + " ");
        System.out.print(d1 + " ");
        System.out.print(Darshan + " ");
        System.out.print(s1 + " ");
        System.out.print(b1 + " ");
        System.out.print(l1 + " ");
        System.out.println(c1 + " ");

        // Taking Input from the User
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number of your choice: ");
        int num1 = scan.nextInt();
        System.out.println(num1);

        System.out.println("Below is the check if above number is valid integer or not: ");
        boolean b2 = scan.hasNextInt(num1); // checks if the entered number is valid or not
        System.out.println(b2);

        System.out.println("Enter a string of your choice: ");
        String s2 = scan.nextLine();
        System.out.println(s2);

        // End of the chapter
    }
}