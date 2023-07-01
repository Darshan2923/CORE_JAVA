import java.util.Scanner;

public class Chapter_1_Programs {
    public static void main(String[] args) {
        // Program to sum 3 numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter the number 3: ");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("Sum of the numbers is: " + sum);

        // Program to calculate cgpa of student in 3 subjects(out of 100)
        // Same as ablove just divide by 3

        // Java program to convert kilometers to miles
        System.out.print("Enter the number for conversion in kilometers: ");
        int km = sc.nextInt();
        System.out.print("After miles conversion, the number becomes: ");
        double mile = km * 1.6;
        System.out.println(mile);
    }

    // program to detect of number entered is Integer or not
    // Already done in Chapter code refer to Chapter_1_Introduction_to_Java

}