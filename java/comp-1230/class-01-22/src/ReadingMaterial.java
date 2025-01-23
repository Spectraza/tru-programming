public class ReadingMaterial {
    private String title;
    private String isbn;
    private double price;
    private int year;
    private Book book = new Book();
    private Magazine magazine = new Magazine();

    public ReadingMaterial(String title, String isbn, double price, int year) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.year = year;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "The information: " + this.isbn + ", " + this.title + ", " + this.price + ", " + this.year;
    }

    public void display(){
        book.bookDisplay();
        magazine.magazineDisplay();
    }
}
