package model;

public abstract class Media {
    private String title;
    private String author;
    private boolean available= true;
    private int amount;

    public Media(String title, String author, int amount) {
        this.title = title;
        this.author = author;
        this.amount = amount;
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
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void loanMedium(int amount) {
        this.amount --;
        if (amount == 0){
            this.available=false;
        }
    }

    public void returnMedium(int amount) {
        this.amount ++;
        if (this.available == false){
            this.available=true;
        }
    }

    public boolean getAvailable() {
        return available;
    }
}