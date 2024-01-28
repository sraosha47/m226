import model.Book;
import model.Customer;

public class Main {
    public static void main(String[] args) {
        Customer example = new Customer("Ted", "Lasso", "0797776669", "ted.lasso@home.com" );
        Book newBook = new Book() {
        }
        System.out.println(example.getFirstname());
        System.out.println(example.getFullname());
    }
}