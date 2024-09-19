import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1-7) to represent the day of week: ");

        int day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Day " +day+ " is a Sunday");
                break;
            case 2:
                System.out.println("Day " +day+ " is a Monday");
                break;
            case 3:
                System.out.println("Day " +day+ " is a Tuesday");
                break;
            case 4:
                System.out.println("Day " +day+ " is a Wednesday");
                break;
            case 5:
                System.out.println("Day " +day+ " is a Thursday");
                break;
            case 6:
                System.out.println("Day " +day+ " is a Friday");
                break;
            case 7:
                System.out.println("Day " +day+ " is a Saturday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7");
        }
    }
}
