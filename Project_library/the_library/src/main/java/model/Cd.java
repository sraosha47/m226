package model;


public class Cd extends Media {
    private String artist;

    public Cd(String title, String artist) {
        super(title, artist); // CDs may not have a specific author, passing an empty string
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
    @Override
    public void info() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Artist: " + this.artist);
        System.out.println("Description:\n" + this.getDescription());
        if (getAvailable()) {
            System.out.println("Available");
        } else {
            System.out.println("Not available");
        }
    }
}
