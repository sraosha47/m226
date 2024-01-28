package model;

/**
 * Backend Class for Person
 */
public abstract class User {
    private String firstname;
    private String surname;
    private String phone;
    private String email;

    public User(String firstname, String surname, String phone, String email) {
        this.firstname = firstname;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullname() {
        return this.firstname.concat(" " + this.surname);
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
