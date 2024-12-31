package com.simactivation.portal.ActivationSummaryService.dto;

public class SimDetails {
    private long serviceNumber;
    private long simNumber;
    private boolean activated;

    public SimDetails() {
    }

    public SimDetails(long serviceNumber, long simNumber, boolean activated) {
        this.serviceNumber = serviceNumber;
        this.simNumber = simNumber;
        this.activated = activated;
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

    public void setSimNumber(long simNumber) {
        this.simNumber = simNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "SimDetails{" +
                "serviceNumber=" + serviceNumber +
                ", simNumber=" + simNumber +
                ", activated=" + activated +
                '}';
    }
}
