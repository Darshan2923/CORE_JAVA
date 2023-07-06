public class Chapter06_Program_in_methods {

    static void multiply(int a) {
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d", a, i, a * i);
            System.out.println("\n");
        }
    }

    static int recursum(int n) {
        if (n == 0)
            return n;
        return n + recursum(n - 1);
    }

    static int fibo(int n) {
        if (n < 2)
            return n;
        return fibo(n - 2) + fibo(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Programs in methods in java");
        // 1.WAP a Java method to print multiplication table of a number n.
        multiply(5);

        // WAP to calculate sum of n numbers using recursion
        System.out.println(recursum(10));

        // WAP a function to find average of set of numbers passed as arguments
        // same as recursive sum but just divide it by n; (HW)

        // WAP find sum of fibonacci series
        System.out.println(fibo(5));

        // WAP to convert celcius to fahrenheit.
        // Home Work

        // WAP to print the star pattern
        // ****
        // ***
        // **
        // *
        // Easy can be done in homework

    }
}
