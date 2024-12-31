package com.simactivation.portal.ActivationSummaryService.dto;

public class ActivationSummary {
    private String email;
    private String dateOfBirth;
    private String firstname;
    private String lastname;
    private String address;

    private long serviceNumber;
    private long simNumber;

    public ActivationSummary() {
    }

    public ActivationSummary(String email, String dateOfBirth, String firstname, String lastname, String address, long serviceNumber, long simNumber) {
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.serviceNumber = serviceNumber;
        this.simNumber = simNumber;
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

    public long getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(long serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public long getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(long simNumber) {
        this.simNumber = simNumber;
    }

    @Override
    public String toString() {
        return "ActivationSummary{" +
                "email='" + email + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", serviceNumber=" + serviceNumber +
                ", simNumber=" + simNumber +
                '}';
    }
}
