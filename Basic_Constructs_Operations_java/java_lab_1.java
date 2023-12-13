
// Implement a java program to calculate gross salary and net salary taking the following data.
// Input: empno, empname, basicProcess DA=70% of basicHRA=30% of basicCCA= Rs. 240/-PF=10% of basicPT=Rs.100/-
import java.util.Scanner;

public class Java_Lab_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Basic Salary of the Employee:");
        double basic = scanner.nextDouble();
        double hra = 0.70 * basic; // 10% of basic
        double da = 0.3 * basic; // 8% of basic
        double pf = 0.1 * basic;
        double cca = 240;
        double pt = 100;
        double grossSalary = basic + hra + da - pf - cca - pt;
        System.out.println("Employee Gross Salary Breakdown:");
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + grossSalary);
    }
}