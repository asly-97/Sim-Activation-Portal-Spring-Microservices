package com.simactivation.portal.CustomerService.exception;


import org.springframework.http.HttpStatus;

public class SAPException extends Exception{

    protected HttpStatus httpStatus;

    public SAPException() {
        super("Undefined SIM Activation Portal Exception");
        httpStatus = HttpStatus.BAD_REQUEST;
    }

    public SAPException(String message) {
        super(message);
        httpStatus = HttpStatus.BAD_REQUEST;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
