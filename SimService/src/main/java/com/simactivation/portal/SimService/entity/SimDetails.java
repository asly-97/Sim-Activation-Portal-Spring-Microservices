package com.simactivation.portal.SimService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sim")
public class SimDetails {
    @Id
    private long serviceNumber;

    private long simNumber;

    private boolean activated;

    public SimDetails(long phoneNumber, long simNumber, boolean activated) {
        this.serviceNumber = phoneNumber;
        this.simNumber = simNumber;
        this.activated = activated;
    }

    public SimDetails() {

    }

    public long getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(long phoneNumber) {
        this.serviceNumber = phoneNumber;
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
                "phoneNumber=" + serviceNumber +
                ", simNumber=" + simNumber +
                ", activated=" + activated +
                '}';
    }
}
