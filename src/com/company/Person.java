package com.company;

import java.util.Locale;

public class Person extends Record {
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        var tmp = super.toString();
        return tmp + ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'';
    }

    @Override
    public void askData() {
        firstName = InputUtils.askString("First name");
        lastName = InputUtils.askString("Last name");
        email = InputUtils.askString("Email");
    }

    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || firstName.toLowerCase().contains(substr)
                || lastName.toLowerCase().contains(substr)
                || email.toLowerCase().contains(substr);
    }
}
