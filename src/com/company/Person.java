package com.company;

import java.time.LocalDate;
import java.util.Locale;

public class Person extends Record {
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate birthDay;
    private String email;
    private String phone;
    
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
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public LocalDate getBirthDay() {
        return birthDay;
    }
    
    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
    
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        var tmp = super.toString();
        return tmp + ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthDay + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'';
    }
    
    @Override
    public void askData() {
        firstName = InputUtils.askString("First name");
        lastName = InputUtils.askString("Last name");
        gender = InputUtils.askString("Gender");
        birthDay = InputUtils.askDate("Birthday");
        email = InputUtils.askString("Email");
        phone = InputUtils.askString("Phone");
    }
    
    
    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || firstName.toLowerCase().contains(substr)
                || lastName.toLowerCase().contains(substr)
                || gender.toLowerCase().contains(substr)
                || InputUtils.getStrDate(birthDay).contains(substr)
                || email.toLowerCase().contains(substr)
                || phone.toLowerCase().contains(substr);
    }
    
    
}
