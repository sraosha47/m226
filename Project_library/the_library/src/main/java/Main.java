import model.Customer;

public class Main {
    public static void main(String[] args) {
        Customer example = new Customer("Ted", "Lasso", "0797776669", "ted.lasso@home.com" );
        System.out.println(example.getFirstname());
    }
}