package model;
public abstract class Librarian extends User {
    private Date anstellungsdatum;

    public LIbrarian(String firstname, String surname, String phone, String email) {
        super(firstname, surname, phone);
        this.anstellungsdatum = anstellungsdatum;
    }
}
