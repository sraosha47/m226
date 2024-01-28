package model;


public class Customer extends User {

    public Customer(String firstname, String surname, String phone, String email) {
        super(firstname, surname, phone, email);
    }

    public void rentMedia(Media medium){

        if(medium.getAvailable()){
            medium.switchAvailablity();
            medium.setOwner(this.getFullname());
        }
    }
}
