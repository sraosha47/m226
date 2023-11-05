package model;

/**
 * Backend Class for Person
 */
public abstract class User {
    private String vorname;
    private String nachname;
    private String phone;
    private String email;

    public User(String vorname, String nachname, String phone, String email) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
