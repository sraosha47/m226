package model;

public class Main {
    public static void main(String[] args) {
        Customer example = new Customer("Ted", "Lasso", "0797776669", "ted.lasso@home.com" );
        Book newBook = new Book("Knulp", "Hermann Hesse");
        Book newBook2 = new Book("Hyperion", "Friedrich Hölderlin");
        Cd newCd = new Cd("The Colours and Shapes", "The Foofighters");

        example.rentMedia(newBook);
        example.rentMedia(newBook2);
        example.rentMedia(newCd);
        example.list();
        example.returnMedia(newBook);
        example.list();
    }
}