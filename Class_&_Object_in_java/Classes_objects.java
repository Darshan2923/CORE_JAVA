class Calc {
    int a = 0;

    public int AddNum(int x, int y) {
        return x + y;
    }
}

public class Classes_objects {
    public static void main(String[] args) {

        // Arrays and Matrices
        int nums[] = { 3, 7, 2, 4 };
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
        for (int it : nums) {
            System.out.println(it);
        }

        // Classes and objects
        int num1 = 4, num2 = 5;
        Calc c = new Calc();
        int z = c.AddNum(num1, num2);
        System.out.println(z);
        System.out.println("Number in the class is: " + c.a);

    }
}
