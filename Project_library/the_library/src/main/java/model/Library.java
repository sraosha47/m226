package model;

import java.util.ArrayList;

public class Library {

    private static Library instance;
    private ArrayList<Media> media = new ArrayList<>();

    private Library(){}

    public static Library getInstance(){
        if (instance == null) {
            synchronized (Library.class) {
                if (instance == null) {
                    instance = new Library();
                }
            }
        }
        return instance;
    }

    public void addMedium(Media medium) {
       media.add(medium);
    }

    public void listMedia(){
        System.out.println("Following articles are available: ");
        for (Media medium : media) {
            if (medium.getAvailable()) {
                medium.info();
            }
        }

    }
}
