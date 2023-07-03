public class Chapter_4_Programs_on_loops {
    public static void main(String[] args) {
        // 1.Write a Java program to print the following pattern.
        // ****
        // ***
        // **
        // *

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // 2.Write a program to sum first n even natural numbers using while loop.
        int k = 0;
        int sum = 0;
        int n = 8;
        while (k != n + 1) {
            if (k % 2 == 0) {
                sum += k;
            }
            k++;
        }
        System.out.println(sum);

        // 3.WAP to print multiplication table of 10 in reverse order.
        int prod = 10;
        while (prod > 0) {
            int i = 10;
            System.out.printf("%d * %d = %d", i, prod, i * prod);
            prod--;
            System.out.println("\n");
        }

        // 4.WAP to find factorial using a for loop
        int fact = 1;
        int n1 = 5;
        for (int i = 1; i <= n1; i++) {
            fact *= i;

        }
        System.out.println(fact);

        // 5.Sum of numbers coming in multiplication table of 8 till 10.
        int decoy = 0;
        for (int i = 0; i <= 80; i++) {
            if (i % 8 == 0) {
                decoy += i;
            }
        }
        System.out.println(decoy);

        // 6.implement do-while loop
        int it = 0;
        do {
            System.out.println("im greater than 10");
            it++;
        } while (it > 10);

    }
}
