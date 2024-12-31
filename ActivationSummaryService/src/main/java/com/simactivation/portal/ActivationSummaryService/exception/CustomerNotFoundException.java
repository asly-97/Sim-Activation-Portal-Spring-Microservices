package com.simactivation.portal.ActivationSummaryService.exception;

public class CustomerNotFoundException extends SAPException {
    public CustomerNotFoundException() {
        super("No request placed for you.");
    }
}
