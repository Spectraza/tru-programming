public class Book {
    private String author;

    public Book(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public void bookDisplay(){
        System.out.println("Author: " + this.author);
    }
}

