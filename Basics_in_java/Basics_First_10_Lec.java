public class Basics_First_10_Lec {
    public static void main(String[] args) {
        System.out.println("Hello there");

        // L5: Variables and identifiers
        String studentName = "John Doe";
        int studentId = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print the variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentId);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        // L6- Type Casting
        // Widening Casting
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myDouble);

        // Narrow Casting
        double myDob = 9.78d;
        int myIn = (int) myDob;
        System.out.println(myIn);

    }
}