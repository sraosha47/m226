package model;

/**
 * Backend Class for Person
 */
public abstract class User {
    private String vorname;
    private String nachname;
    private String telefonnummer;
    private String email;

    public User(String vorname, String nachname, String telefonnummer, String email) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.telefonnummer = telefonnummer;
        this.email = email;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
