package com.simactivation.portal.ActivationSummaryService.exception;

import org.springframework.http.HttpStatus;

public class UnregisteredPhoneNumberException extends SAPException{
    public UnregisteredPhoneNumberException() {
        super("This phone number is not registered to any customer.");
        httpStatus = HttpStatus.NOT_FOUND;
    }
}
