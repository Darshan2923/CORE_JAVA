class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = "Your name";
    }

    public void setName(String n) {
        this.name = n;
    }
}

public class Chapter_9_Access_modifiers_and_Constructors {
    public static void main(String[] args) {
        // Access modifiers:-Specifies where a property/method is accesible.There are
        // fiur types of access modifiers.
        // 1.Private
        // 2.Default
        // 3.Protected
        // 4.Public

        // Getters and setters
        // Getter-->Returns a value
        // Setter-->Sets/updates a value
        // Example:-See class employee above this file.

        // Constructors
        // A number function used to initialize an object while creating it.
        Employee perry = new Employee();
        perry.setName("Draken Bhai");

        // In order to write your own constructor we define a method with name same as
        // class name.
        /*
         * public Employee(){
         * name="Your name";
         * }
         */

        // Constructor overloading
        // They can also be overloaded by passing the parameters .

        // Note:-
        /*
         * 1.Constructors can take parameters without being overloaded.
         * 2.There can be more than two overloaded constructors.
         */

    }
}
