import java.util.Scanner;

public class Chapter_3_Problem_Programs {
    public static void main(String[] args) {
        // 1.Write a program to grade a child based on marks from 100. if 75+ then A,65+
        // then B and so on till 40 being D.below 40 display "student is failed"
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of the student: ");
        try {
            int marks = sc.nextInt();
            if (marks >= 75) {
                System.out.println("A");
            } else if (marks >= 65) {
                System.out.println("B");
            } else if (marks >= 55) {
                System.out.println("C");
            } else if (marks >= 40) {
                System.out.println("D");
            } else if (marks < 40) {
                System.out.println("Student is failed");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        // Write a program in Java to find out the day of the week being 1->monday;
        // 2->tuesday;3->wednesday
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week: ");
        int dayofweek = scan.nextInt();
        switch (dayofweek) {
            case 1 -> {
                System.out.println("Monday");
            }
            case 2 -> {
                System.out.println("Tuesday");
            }
            case 3 -> {
                System.out.println("Wednesday");
            }
            case 4 -> {
                System.out.println("Thursday");
            }
            case 5 -> {
                System.out.println("Friday");
            }
            case 6 -> {
                System.out.println("Saturday");
            }
            case 7 -> {
                System.out.println("Sunday");
            }
        }
        // I have used advamced switch so i dont need to use the break statement

        // 3.Write a program for tax deductions with input given by the user
        // Easy can be done by simple if else statements.

        // 4.Write a simple program to find out the type of website from the url
        // .com -> "Commercial"
        // .in -> "Indian"
        // .org ->"Organisation"
        Scanner com = new Scanner(System.in);
        System.out.println("Enter the url of the company: ");
        String url = com.next();
        if (url.endsWith(".com")) {
            System.out.println("Commercial website");
        }
        if (url.endsWith(".in")) {
            System.out.println("Indian website");
        }
        if (url.endsWith(".org")) {
            System.out.println("Organisational website");
        }

        // For more problems visit this
        // url->https://www.codewithharry.com/tutorial/java/

    }
}
