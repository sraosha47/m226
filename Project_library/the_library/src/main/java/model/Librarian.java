package model;
public abstract class Librarian extends User {
    private Date anstellungsdatum;

    public User(String firstname, String surname, String phone, String email) {
        super(vorname, nachname, telefonnummer);
        this.anstellungsdatum = anstellungsdatum;
    }
}
