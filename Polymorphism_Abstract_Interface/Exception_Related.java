class DarshanException extends Exception {
    public DarshanException(String string) {
        super(string);
    }
}

public class Exception_Related {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        int k = 20;
        try {
            // j = j / i;
            j = j / k + i;
            if (j == 0)
                throw new DarshanException("I dont want j to be zero");
        } catch (DarshanException e) {
            System.out.println("Mujhe nai chahiye exception");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error or no remainder to be zero" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("stay in limit" + e);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
