import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int input;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you number: ");
        input = scanner.nextInt();

        String letterGrade;

        switch (input / 10) {
            case 10:
                letterGrade = "Your grade is A";
                System.out.println(letterGrade);
                break;
            case 9:
                letterGrade = "Your grade is A";
                System.out.println(letterGrade);
                break;
            case 8:
                letterGrade = " Your grade is B";
                System.out.println(letterGrade);
                break;
            case 7:
                letterGrade = "Your grade is C";
                System.out.println(letterGrade);
                break;
            case 6:
                letterGrade = "Your grade is D";
                System.out.println(letterGrade);
                break;
            default:
                letterGrade = "Your grade is F";
                System.out.println(letterGrade);
        }

    }
}