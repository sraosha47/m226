package model;

public abstract class Media {
    private String title;
    private String author;
    private boolean available = true;

    private String owner;


    public Media(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String name){
        this.owner = name;
    }

    public boolean getAvailable() {
        return available;
    }

    public void switchAvailablity() {
        if (available == true) {
            this.available = false;
        } else {
            this.available = true;
        }
    }

}