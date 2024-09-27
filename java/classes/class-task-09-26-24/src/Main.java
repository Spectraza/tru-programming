import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[7];
        String words = "Sorted numbers:";
        String revewords = " ";

        System.out.println("The size of the array is " + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < words.length(); i++) {
            revewords = words.charAt(i) + revewords;
        }
        System.out.println(revewords);

        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.println(i + "");
        }


//        System.out.println("The number in reverse order: ");
//
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println(numbers[i] + " ");
//        }
    }
}