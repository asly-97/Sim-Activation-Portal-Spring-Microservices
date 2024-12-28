package com.simactivation.portal.SimService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class SimNotFoundException extends SAPException{

    public SimNotFoundException(){
        super("The requested SIM does not exist, please check your details.");
    }
}
