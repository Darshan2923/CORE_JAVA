@Deprecated
class A {
    public void showTheDataBelongingsToClass() {
        System.out.println("in A show");
    }
}

class B extends A {
    @Override
    public void showTheDataBelongingsToClass() {
        System.out.println("in B show");
    }
}

public class Annotation_in_java {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataBelongingsToClass();
    }
}