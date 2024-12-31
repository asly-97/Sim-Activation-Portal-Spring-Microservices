package com.simactivation.portal.CustomerService.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class CustomerDTO {
    @NotNull(message = "Service number is required")
    @Digits(integer = 10, fraction = 0,message = "{invalid_service_number}")
    private Long serviceNumber;

    @NotNull(message = "Email is required")
    @Pattern(regexp = "(\\w)+@[a-zA-Z].[a-z]{2,3}",message = "invalid_email")
    private String email;


    @NotNull(message = "DOB is required")
    @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}",message = "{invalid_dob}")
    private String dateOfBirth;

    @Null
    @Size(max = 15)
    private String firstname;
    @Size(max = 15)
    private String lastname;
    private String address;

    public CustomerDTO() {
    }

    public CustomerDTO(Long serviceNumber, String email, String dateOfBirth) {
        this.serviceNumber = serviceNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public CustomerDTO(Long serviceNumber, String email, String dateOfBirth, String firstname, String lastname, String address) {
        this.serviceNumber = serviceNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public Long getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(Long serviceNumber) {
        this.serviceNumber = serviceNumber;
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

    public @Null @Size(max = 15) String getFirstname() {
        return firstname;
    }

    public void setFirstname(@Null @Size(max = 15) String firstname) {
        this.firstname = firstname;
    }

    public @Size(max = 15) String getLastname() {
        return lastname;
    }

    public void setLastname(@Size(max = 15) String lastname) {
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
        return "CustomerDTO{" +
                "serviceNumber=" + serviceNumber +
                ", email='" + email + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
