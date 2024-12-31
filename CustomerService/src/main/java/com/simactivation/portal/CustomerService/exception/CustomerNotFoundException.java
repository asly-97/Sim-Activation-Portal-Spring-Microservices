package com.simactivation.portal.CustomerService.exception;

import org.springframework.http.HttpStatus;

public class CustomerNotFoundException extends SAPException{
    public CustomerNotFoundException() {
        super("No request placed for you.");
    }
}
