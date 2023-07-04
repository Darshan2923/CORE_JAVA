public class Chapter_6_Methods_in_java {
    static int logic(int x, int y) {
        return x + y;
    }

    int logic(int x, int y, int z) {
        return x + y + z;
    }

    static int fact(int n) {
        if (n == 1)
            return n;
        else
            return n * fact(n - 1);

    }

    public static void main(String[] args) {
        System.out.println(
                "Methods in java aur merely functions inside the Classes.Just like any another programming languages");
        // method to do sum of two numbers
        int c = logic(2, 3);
        System.out.println(c);

        // Other way to instantiation of object
        Chapter_6_Methods_in_java obj = new Chapter_6_Methods_in_java();
        c = obj.logic(7, 2, 8); // Joke joke me i thought you another concept of overloading.we'll learn it
                                // later.
        System.out.println(c);

        // Method Overloading
        // Two or more methods can have same name name but different parameters. Such
        // methods are called
        // Example of above thing is given earlier where method logic takes two
        // parameters in one method and
        // three parameters in another method.

        // Recursion
        // A method in java can call itself such calling of function by itself is called
        // recursion
        // For Example:Factorial of number
        int n = 6;
        int factorial = fact(n);
        System.out.println(factorial);

        // Continued by programs

    }
}
