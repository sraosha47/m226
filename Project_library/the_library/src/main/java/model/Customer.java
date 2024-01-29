package model;

import java.util.ArrayList;

public class Customer extends User {

    public ArrayList<Media> media = new ArrayList<>();
    public Customer(String firstname, String surname, String phone, String email) {
        super(firstname, surname, phone, email);
    }

    public void rentMedia(Media medium){
        if(medium.getAvailable()){
            medium.switchAvailability();
            medium.setOwner(this.getFullname());
            medium.setTimestamp();
            media.add(medium);
        }
    }

    public void listRented() {
        System.out.println("Currently rented: ");
        for(Media medium : media) {
            medium.info();
            System.out.println("Owned by: " + medium.getOwner() + "\n");
        }
    }

    public void returnMedia(Media medium) {
        if(medium.getOwner().equals(this.getFullname())){
            medium.switchAvailability();
            medium.setOwner("");
            media.remove(medium);
        } else {
            System.out.println("This article is not in your possession.");
        }
    }


}
