//Valeriia Savych
//TRU ID: T00739110

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your message: ");
        String message = scanner.nextLine();

        MessageProcessor mP = new MessageProcessor(message);
        mP.setUpperCase(message);
        mP.setLowerCase(message);

        System.out.println("Upper Case: " + mP.getUpperCase());
        System.out.println("Lower Case: " + mP.getLowerCase());

        mP.setWordCount(message.split(" ").length);

        System.out.println("Word Count: " + mP.getWordCount());

        mP.setReverseMessage(message);

        System.out.println("Reverse Messaged: " + Arrays.toString(mP.getReverseMessage()));


    }
}