public class Chapter_5_Arrays_in_java {
    public static void main(String[] args) {
        // Array is a collection of similar types of data

        // Initialization of an array
        int[] marks = new int[5];
        // an array containing integers is initialized by the capacity of 5.
        // Indexing starts with 0.
        // Can also be declared as:
        int marks1[] = { 1, 3, 4, 5, 6 };
        System.out.println(marks1);
        int[] marks2;
        marks2 = new int[5];
        System.out.println(marks2);
        // Accessing the array elements
        marks[0] = 10;
        marks[1] = 108;
        marks[2] = 108;
        marks[3] = 108;
        marks[4] = 108;
        // Initialized all elements.
        // Note that elements in an array are mutable

        int length = marks.length;
        // Gives size of array
        System.out.println("Length of array is: " + length);

        // Displaying an array
        for (int i : marks) {
            System.out.println(i);
        }

        // Multidimensional array
        // can declared as normal array by:
        int[][] flats = new int[2][3];
        String[][][] arr = new String[2][3][4];

        // Thank You.
    }
}
