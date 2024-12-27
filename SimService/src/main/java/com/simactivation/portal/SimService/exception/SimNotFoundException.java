package com.simactivation.portal.SimService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class SimNotFoundException extends RuntimeException{

    private static final String message =
            "The requested SIM does not exist, please check your details.";
    private final HttpStatus status =
            HttpStatus.NOT_FOUND;

    public SimNotFoundException(){
        super(message);
    }

    public HttpStatus getStatus() {
        return status;
    }
}
