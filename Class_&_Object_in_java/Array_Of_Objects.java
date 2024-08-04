class Student {
    int rollno;
    String name;
    int marks;
}

public class Array_Of_Objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Ramu";
        s1.marks = 90;
        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Kamu";
        s2.marks = 80;
        Student s3 = new Student();
        s3.rollno = 4;
        s3.name = "Dingu";
        s3.marks = 98;

        Student stud[] = new Student[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

        // for (int i = 0; i < stud.length; i++) {
        // System.out.println(stud[i].name + ": " + stud[i].marks);
        // }

        for (Student stud1 : stud) {
            System.out.println(stud1.name + ": " + stud1.marks);
        }

        // StringBuffer and StringBuilder
        StringBuffer sb = new StringBuffer("Darshan");
        System.out.println(sb.capacity()); // originally 16 bytes
        sb.append(" Patel");
        sb.insert(0, "Java with ");
        String str = sb.toString();
        System.out.println(str);

    }
}
