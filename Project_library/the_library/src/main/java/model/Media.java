package model;

public abstract class Media {
    private String title;
    private Boolean available;
    private int amount;

    public Media(String title, String available, int amount) {
        this.title = title;
        this.amount = amount;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setTelefonnummer(Boolean available) {
        this.available = available;
    }
}