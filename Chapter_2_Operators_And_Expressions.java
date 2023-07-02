public class Chapter_2_Operators_And_Expressions {
    public static void main(String[] args) {
        // Types of operators
        /*
         * Arithmetic: +,-,*,/,%,++,--.
         * Assignment: =,+=,-=.
         * Comparison: ==,>,<,<=,>=.
         * Logical: &&,||, !.
         * Bitwise: &, | (Operates bitwise).
         */

        // Operators Precedence and associativity
        /*
         * https://www.researchgate.net/figure/Precedence-and-Associativity-of-Operators
         * -in-Java-6_fig2_224187627
         */

        // Increment and decrement operators
        /*
         * a++ : first use then increment.
         * ++a : first increment then use.
         * a-- : first use then decrement.
         * --a : first decrement then use.
         */

        ////////////////// Strings /////////////////
        // A string is a sequence of characters and not a primitive datatype
        String name = "Darshan  is         a good boy";
        // Strings are immutable
        // name="Nashik" --gives an error

        // String Methods
        name.length();
        name.toLowerCase();
        name.toUpperCase();
        name.trim();
        name.substring(0, 7);
        name.replace("good", "bad");
        name.startsWith("Dar");
        name.endsWith("boy");
        name.equals(name);

        //// Escape Sequence Characters////
        String Ram = "Ram was great\n He defeated the powerful Ravana\t without a luxurious army. ";
        System.out.println(Ram);
        /*
         * \n -- new line
         * \t --tab
         * \\ --backslash
         * \' --single tick
         */

        // Note: we can also use
        System.out.printf("Ram was a %s", "hero");
        // like in C.

        // Chapter-2 End

    }
}