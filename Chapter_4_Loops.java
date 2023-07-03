public class Chapter_4_Loops {
    public static void main(String[] args) {
        // Loops in Java
        /*
         * Loops in Java allow you to repeat a block of code multiple
         * times. The three types of loops are: "for" loop
         * , which specifies the initial value, condition, and increment; "
         * while" loop, which executes as long as a condition is true; and
         * "do-while" loop, which executes at least once and then repeats as
         * long as the condition is true. Loops help automate repetitive
         * tasks and make programs more efficient by reducing redundant code.
         */

        // Types of loops in Java
        /*
         * In Java, there are three types of loops: "for" loop, "while" loop, and
         * "do-while" loop.
         * 
         * The "for" loop is used when you know the number of iterations in advance. For
         * example:
         * 
         * ```java
         * for (int i = 1; i <= 5; i++) {
         * System.out.println("Iteration: " + i);
         * }
         * ```
         * 
         * The "while" loop is used when the number of iterations is not known in
         * advance. For example:
         * 
         * int i = 1;
         * while (i <= 5) {
         * System.out.println("Iteration: " + i);
         * i++;
         * }
         * 
         * The "do-while" loop is similar to the "while" loop, but it always executes at
         * least once. For example:
         * 
         * int i = 1;
         * do {
         * System.out.println("Iteration: " + i);
         * i++;
         * } while (i <= 5);
         */

        // Break and continue statements
        /*
         * Here's an example that demonstrates the use of the "break" and "continue"
         * statements in Java:
         * 
         * for (int i = 1; i <= 5; i++) {
         * if (i == 3) {
         * break; // Terminates the loop when i equals 3
         * }
         * System.out.println("Iteration: " + i);
         * }
         * 
         * In this code snippet, the loop will print "Iteration: 1" and "Iteration: 2".
         * When the value of "i" becomes 3, the "break" statement is encountered,
         * causing the loop to terminate.
         * 
         * for (int i = 1; i <= 5; i++) {
         * if (i == 3) {
         * continue; // Skips the rest of the loop when i equals 3
         * }
         * System.out.println("Iteration: " + i);
         * }
         * 
         * In this example, the loop will print "Iteration: 1", "Iteration: 2",
         * "Iteration: 4", and "Iteration: 5". When "i" is equal to 3, the "continue"
         * statement is encountered, skipping the rest of the code for that iteration
         * and proceeding to the next iteration.
         */
    }
}
