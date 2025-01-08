//Valeriia Savych
//TRU ID: T00739110

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int chCount = sentence.length();
        System.out.println("Character count: " + chCount);

        int wCount = sentence.split(" ").length;
        System.out.println("Word count: " + wCount);

        String firstWord = sentence.substring(0, sentence.indexOf(" "));
        String lastWord = sentence.substring(sentence.lastIndexOf(" ") + 1);

        System.out.println("First word is: " + firstWord);
        System.out.println("Last character: " + lastWord);

        String upperCase = sentence.toUpperCase();
        System.out.println("Upper Case: " + upperCase);

        String lowerCase = sentence.toLowerCase();
        System.out.println("Lower Case: " + lowerCase);

        System.out.println("Which word do you want to check? ");
        String wordOne = scanner.nextLine();
        boolean containsWord = wordOne.contains(wordOne);
        System.out.println("The word " + wordOne + " is " + containsWord);

        System.out.println("What kind of word do you want to replace? ");
        String word = scanner.nextLine();
        System.out.println("Enter the word you want to replace into:  ");
        String replaceWord = scanner.nextLine();
        String replacedString = sentence.replace(word, replaceWord);
        System.out.println("The word " + word + " is " + replaceWord);
        System.out.println("Updated sentence: " + replacedString);

//        int vcount = 0;
//        int ccount = 0;
//        for (int i = 0; i < sentence.length(); i++) {
//            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
//                vcount++;
//            }
//            else if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
//                ccount++;
//            }
//
//        }
//        System.out.println("Vowels Count: " + vcount);
//        System.out.println("Consonant Count: " + ccount);

        //I tried something, but it doesn't work properly
    }
}