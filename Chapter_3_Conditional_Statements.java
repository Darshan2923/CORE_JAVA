public class Chapter_3_Conditional_Statements {
    public static void main(String[] args) {
        // Java's conditional statements let you modify how your programme runs
        // depending on specific circumstances. These statements allow you to decide if
        // a condition is true or false and then run particular chunks of code
        // accordingly. If statements, if-else statements, and switch statements are the
        // three primary categories of conditional statements in Java.

        // 1. If Statement: The "if" statement is the most basic type of conditional
        // statement in Java. It only enables you to run a block of code when a certain
        // condition is met. The following generic syntax is used:
        // The code included in curly brackets will run if the condition evaluates to
        // true. The code block is bypassed in any other case.
        if (10 > 15) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // 2. The "if-else" phrase expands the capabilities of the With the help of
        // conditional statements, you may create programmes that can decide what to do
        // and change how they behave in response to various circumstances. They provide
        // you command over how your programme runs and let you deal with various
        // scenarios skillfully.
        int age = 18;
        if (age > 15) {
            System.out.println("Your in");
        } else {
            System.out.println("Not allowed");
        }

        // 3. Switch Statement: Using the "switch" statement, you can choose which of
        // numerous code blocks will be performed based on the result of an expression
        // or a variable. It offers a clear solution to handle numerous potential
        // circumstances. The following generic syntax is used: The code block that
        // corresponds to the case is run when the expression has been evaluated and its
        // value determined. After running the corresponding case, the switch block is
        // terminated using the "break" command. The default block's function is run if
        // none of the circumstances do.

        switch (age) {
            case 12: {
                System.out.println("Your'e to small to play");
                break;
            }
            case 15: {
                System.out.println("Still small");
                break;
            }
            case 18: {
                System.out.println("Perfect");
                break;
            }
            default: {
                System.out.println("Not done");
            }
        }

        // YOu can also use AND OR ans NOT operators in the same
        String drink = "no";
        if (age == 18 && drink == "no") {
            System.out.println("Your'e good");
        }

    }
}
