package model;


public class Cd extends Media {
    private String artist;

    public Cd(String title, String artist) {
        super(title, artist); // CDs may not have a specific author, passing an empty string
        this.artist = artist;
    }
}