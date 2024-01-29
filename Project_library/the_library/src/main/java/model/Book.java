package model;


public class Book extends Media {
    private String isbn;
    public Book(String title, String author, String isbn) {
        super(title, author);
        this.isbn = isbn;
    }

}
