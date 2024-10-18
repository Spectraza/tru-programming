//Valeriia Savych
//T00739110

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Tales of Beedle and Bard", "J. K. Rowling", 22);
        Book book2 = new Book("The Wonderful Wizard of Oz", "L. Frank Baum", 20);

        System.out.println("Book 1: ");
        book1.displayDetails();

        System.out.println("Book 2: ");
        book2.displayDetails();

        book1.setPrice(23);

        System.out.println("Updated Book 1: ");
        book1.displayDetails();
    }
}
