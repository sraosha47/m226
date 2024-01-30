package model;

import java.util.ArrayList;

public class Customer extends User {

    public ArrayList<Media> media = new ArrayList<>();

    /**<h3>Constructor</h3>
     * <p>Inherited from User</p>
     * @param firstname
     * @param surname
     * @param phone
     * @param email
     */
    public Customer(String firstname, String surname, String phone, String email) {
        super(firstname, surname, phone, email);
    }

    /** <h3>rentMedia</h3>
     * <p>Changes availability of medium, sets the owner and a new Timestamp,
     * and adds medium to ArrayList media.</p>
     * @param medium
     */
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
