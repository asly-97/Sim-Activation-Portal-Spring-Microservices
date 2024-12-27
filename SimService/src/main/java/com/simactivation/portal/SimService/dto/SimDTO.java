package com.simactivation.portal.SimService.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class SimDTO {

    @NotNull
    @Pattern(regexp = "\\d{10}",message = "Service number should be 10 digit numeric value\n")
    private int serviceNumber;

    @NotNull
    @Pattern(regexp = "\\d{13}",message = "SIM number should be 13 digit numeric value")
    private int simNumber;

    public SimDTO(int serviceNumber, int simNumber) {
        this.serviceNumber = serviceNumber;
        this.simNumber = simNumber;
    }
    public int getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public int getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(int simNumber) {
        this.simNumber = simNumber;
    }
}
