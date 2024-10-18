import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        final float ASGN_PER = .20f, MID1_PER = .20f, MID2_PER = .20f, FNL_PER = .40f;
        float asgn, mid1, mid2, fnl, finalGrade;
        String firstName, lastName;
        Scanner scan = new Scanner(System.in);
        Student s1 = new Student();
        System.out.print("Enter va: ");

        System.out.print("Enter value for ASGN: ");
        asgn = scan.nextFloat();

        System.out.print("Enter value for First Name: ");
        firstName = scan.nextLine();
        System.out.print("Enter value for Last Name: ");
        lastName = scan.nextLine();
        System.out.print("Enter value for a Midterm 1: ");
        mid1 = scan.nextFloat();
        System.out.print("Enter value for a Midterm 2: ");
        mid2 = scan.nextFloat();

        System.out.print("Enter value for a Final Exam: ");
        fnl = scan.nextFloat();

        finalGrade = (asgn * ASGN_PER) + (mid1 * MID1_PER) + (mid2 * MID2_PER) + (fnl * FNL_PER);

        System.out.println("Hi, " +firstName+ " ");
        System.out.println("Your Final Grade is: " + s1.finalGrade + finalGrade);
//        final int ROLLS = 500;
//        int num1, num2, count = 0;
//        Die die1 = new Die();
//        Die die2 = new Die();
//
//        for(int roll = 1; roll <= ROLLS; roll++){
//            num1 = die1.roll
//        }
    }
}