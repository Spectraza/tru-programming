//import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int correctNumber = rand.nextInt(10)+1;
        int userGuess;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game");

        do{
            System.out.println("Please enter a number between 1 and 10: ");
            userGuess = scan.nextInt();
            attempts++;

            if(userGuess < correctNumber){
                System.out.println("Your number is too low! Try again.");
            } else if (userGuess > correctNumber) {
                System.out.println("Your number is too high! Try again.");

            }
        } while (userGuess != correctNumber);

        System.out.println("Congratulations! You guessed the correct number: " + correctNumber);
        System.out.println("It took you " + attempts + " attempts to guess the correct number.");

//        int sum = 0;
//        int number;
//
//        do{
//            System.out.println("Enter a positive number: ");
//            number = scan.nextInt();
//            if (number >= 0){
//                sum += number;
//            }
//
//        } while (number >= 0);
//
//        System.out.println("Total sum: " + sum);

//        double sum = 0, value, count = 0;
//        double average;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter an integer (0 to quit): ");
//        value = scan.nextDouble();
//
//        while (value != 0){ // sentinel value of 0 to terminate loop
//            count++;
//            sum += value;
//            System.out.println("The sum so far is " + sum);
//            System.out.print("Enter an integer (0 to quit): ");
//            value = scan.nextInt();
//        }
//            System.out.println();
//        if (count == 0)
//            System.out.println("No values were entered.");
//        else {
//            average = (double) sum / count;
//            DecimalFormat fmt = new DecimalFormat("0.###");
//            System.out.println("The average is " + fmt.format(average));
//        }


    }
}