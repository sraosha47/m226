package model;


public abstract class Customer extends User {

    public Customer(String firstname, String surname, String phone, String email) {
        super(firstname, surname, phone, email);
    }
}
