@FunctionalInterface // It's an interface having only one method
interface A {
    // void show(int i);
    int add(int i, int j);

}

// class B implements A {
// public void show() {
// System.out.println("In show");
// }
// }

// Using inner class for the above class

public class Functional_Interface {
    public static void main(String[] args) {
        // A obj = new A() {
        // public void show() {
        // System.out.println("In show");
        // }
        // };
        // obj.show();

        // same as in lambda expression

        // A obj = (i) -> {
        // System.out.println("In show");
        // };
        // obj.show(5);

        // 2->
        // A obj = new A() {
        // public int add(int i, int j) {
        // return i + j;
        // }
        // };
        // int result = obj.add(5, 6);
        // System.out.println(result);

        // same as

        A obj = (i, j) -> {
            return i + j;
        };
        int result = obj.add(5, 6);
        System.out.println(result);
    }
}
