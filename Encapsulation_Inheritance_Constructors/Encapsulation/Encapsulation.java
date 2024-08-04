class Human {
    private int age;
    private String name;

    // Encapsulation is binding data with methods lol and using getters and
    // setters...

    // Constructor is used to assign the values when the object is created
    public Human() {
        age = 20;
        name = "Jane Doe";
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // preference when called in a function is always given to the local variable jo
    // already tha parameter me...but we want to assign the value to the instance
    // variable(variable of the class) and not to itsel. Hence we use this jo batata
    // hai ki instance variable ka value change kro!!!
    // Defn- 'this' keyword refers to the current object (obj in this case) who is
    // calling the setAge
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(18, "Darshan");

        // obj.setName("Darshan");
        // obj.age = 11;
        // obj.name = "Darshan";

        System.out.println(obj1.getName() + ": " + obj1.getAge());
        System.out.println(obj.getName() + ": " + obj.getAge());
    }
}
