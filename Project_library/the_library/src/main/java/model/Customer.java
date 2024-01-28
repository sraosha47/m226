package model;

import java.util.ArrayList;

public class Customer extends User {

    public ArrayList<Media> media = new ArrayList<>();
    public Customer(String firstname, String surname, String phone, String email) {
        super(firstname, surname, phone, email);
    }

    public void rentMedia(Media medium){
        if(medium.getAvailable()){
            medium.switchAvailablity();
            medium.setOwner(this.getFullname());
            medium.setTimestamp();
            media.add(medium);
        }
    }

    public void list() {
        for(Media medium : media) {
            medium.info();
            System.out.println("Owned by: " + medium.getOwner() + "\n");
        }
    }

    public void returnMedia(Media medium) {
        if(medium.getOwner() == this.getFullname()){
            medium.switchAvailablity();
            medium.setOwner("");
        } else {
            System.out.println("This article is not in your possession.");
        }
    }


}
