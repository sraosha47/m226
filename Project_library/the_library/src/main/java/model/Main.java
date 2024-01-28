package model;

public class Main {
    public static void main(String[] args) {
        Customer example = new Customer("Ted", "Lasso", "0797776669", "ted.lasso@home.com" );
        Book newBook = new Book("Knulp", "Hermann Hesse");

        System.out.println(example.getFirstname());
        System.out.println(example.getFullname());
        System.out.println(newBook.getTitle() + " by " + newBook.getAuthor() + "/n It is owned by " + newBook.getOwner());
        example.rentMedia(newBook);
        System.out.println(newBook.getTitle() + " by " + newBook.getAuthor() + "/n It is owned by " + newBook.getOwner());
    }
}