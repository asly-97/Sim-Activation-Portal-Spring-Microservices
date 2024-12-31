package com.simactivation.portal.ActivationSummaryService.dto;

import jakarta.validation.constraints.*;

public class CustomerDetails {

    private String email;
    private String dateOfBirth;
    private String firstname;
    private String lastname;
    private String address;

    public CustomerDetails() {
    }

    public CustomerDetails(String email, String dateOfBirth, String firstname, String lastname, String address) {
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "email='" + email + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
