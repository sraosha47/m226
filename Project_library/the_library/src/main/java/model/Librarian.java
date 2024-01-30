package model;


import java.util.ArrayList;

public class Librarian extends User {

    public Librarian(String firstname, String surname, String phone, String email) {
        super(firstname, surname, phone, email);
    }

    public void addMedia(ArrayList<Media> library, Media newMedia) {
        library.add(newMedia);
        System.out.println("New media added to the library:");
        newMedia.info();
    }

    public void changeMediaInfo(ArrayList<Media> library, Media mediaToUpdate, String newDescription, boolean newAvailability) {
        if (library.contains(mediaToUpdate)) {
            mediaToUpdate.setDescription(newDescription);
            mediaToUpdate.setAvailability(newAvailability);
            System.out.println("Media information updated:");
            mediaToUpdate.info();
        } else {
            System.out.println("Media not found in the library.");
        }
    }
}