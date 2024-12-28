package com.simactivation.portal.SimService.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


public class SimDTO {

    @NotNull
    @Digits(integer = 10, fraction = 0, message = "{invalid_service_number}")
    //@Pattern(regexp = "\\d{10}", message = "{invalid_service_number}")
    private long serviceNumber;

    @NotNull
    @Digits(integer = 13, fraction = 0, message = "{invalid_sim_number}")
    //@Pattern(regexp = "\\d{13}", message = "{invalid_sim_number}")
    private long simNumber;

    public SimDTO(long serviceNumber, long simNumber) {
        this.serviceNumber = serviceNumber;
        this.simNumber = simNumber;
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

    public void setSimNumber( long simNumber) {
        this.simNumber = simNumber;
    }
}
