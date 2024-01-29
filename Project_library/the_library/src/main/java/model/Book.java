package model;


public class Book extends Media {
    private String isbn;
    public Book(String title, String author, String isbn) {
        super(title, author);
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }

    public void info() {
        System.out.println( "Title: "+ this.getTitle());
        System.out.println( "Author: "+ this.getAuthor());
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Description:\n"+ this.getDescription());
        if (getAvailable()){
            System.out.println( "Available" );
        } else {
            System.out.println( "Not available");
        }
    }
}
