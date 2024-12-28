package com.simactivation.portal.SimService.exception;

public class SIMAlreadyActivatedException extends SAPException{
    public SIMAlreadyActivatedException(){
        super("The provided SIM is already activated.");
    }
}
