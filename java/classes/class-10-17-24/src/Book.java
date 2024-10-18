public class Book {
    private String title;
    private String author;
    private int price;
    private float mileage;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book's Title: " + title);
        System.out.println("Book's Author: " + author);
        System.out.println("Book's Price: " + price);
    }
}
