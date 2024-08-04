
enum Status {
    Running,
    Failed,
    Pending,
    Success;
}

public class Enums_in_java {
    public static void main(String[] args) {
        Status s = Status.Failed;
        Status[] s1 = Status.values();
        System.out.println(s);
        for (Status ss : s1) {
            System.out.println(ss + ": " + s.ordinal());
        }
        System.out.println(s.ordinal());
    }
}
