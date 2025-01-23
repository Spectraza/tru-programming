import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the title: ");
        String title = new Scanner(System.in).nextLine();

        System.out.println("Enter the isbn: ");
        String isbn = new Scanner(System.in).nextLine();

        System.out.println("Enter the price: ");
        double price = new Scanner(System.in).nextDouble();

        System.out.println("Enter the year: ");
        int year = new Scanner(System.in).nextInt();
        ReadingMaterial rm = new ReadingMaterial(title, isbn, price, year);

        System.out.println("Enter the author: ");
        String author = new Scanner(System.in).nextLine();

        Book book = new Book(author);

        System.out.println("Enter the editor: ");
        String editor = new Scanner(System.in).nextLine();

        System.out.println("Enter the month: ");
        String month = new Scanner(System.in).nextLine();

        Magazine magazine = new Magazine(editor, month);

        System.out.println(rm.toString());
        rm.display();
    }
}