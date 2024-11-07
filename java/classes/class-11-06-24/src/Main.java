import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice (Rock, Paper, or Scissors): ");
        String userChoice = scan.nextLine();

        // Get computer choice
        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = choices[computerChoiceIndex];
        System.out.println("Computer chose: " + computerChoice);

        // Determine the winner
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
                (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                        (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                        (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
        ) {
            System.out.println("You win!");
        } else if (computerChoice.equals("Rock") && userChoice.equalsIgnoreCase("Scissors") ||
                computerChoice.equals("Paper") && userChoice.equalsIgnoreCase("Rock") ||
                computerChoice.equals("Scissors") && userChoice.equalsIgnoreCase("Paper")) {

            System.out.println("Computer wins!");
        } else {
            System.out.println("Invalid choice");
        }

        System.out.println("Do you want to play again? (Y/N)");
        String playAgain = scan.nextLine();

        while (playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N")) {
            System.out.println("Enter your choice (Rock, Paper, or Scissors): ");
            userChoice = scan.nextLine();

            // Get computer choice
            computerChoiceIndex = random.nextInt(3);
            computerChoice = choices[computerChoiceIndex];
            System.out.println("Computer chose: " + computerChoice);

            // Determine the winner
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                    (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                            (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                            (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
            ) {
                System.out.println("You win!");

            } else if (computerChoice.equals("Rock") && userChoice.equalsIgnoreCase("Scissors") ||
                    computerChoice.equals("Paper") && userChoice.equalsIgnoreCase("Rock") ||
                    computerChoice.equals("Scissors") && userChoice.equalsIgnoreCase("Paper")) {

                System.out.println("Computer wins!");

            } else {
                System.out.println("Invalid choice");
            }
            System.out.println("Do you want to play again? (Y/N)");
            playAgain = scan.nextLine();
        }

        System.out.println("Thank you for playing!");

    }
}