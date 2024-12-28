package com.simactivation.portal.SimService.exception;

public class InvalidSIMException extends SAPException{
    public InvalidSIMException(){
        super("The provided SIM details are invalid.");
    }
}
