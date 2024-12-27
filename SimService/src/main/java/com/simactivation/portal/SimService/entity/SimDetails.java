package com.simactivation.portal.SimService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sim")
public class SimDetails {
    @Id
    private int serviceNumber;

    private int simNumber;

    private boolean activated;

    public SimDetails(int phoneNumber, int simNumber, boolean activated) {
        this.serviceNumber = phoneNumber;
        this.simNumber = simNumber;
        this.activated = activated;
    }

    public SimDetails() {

    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(int phoneNumber) {
        this.serviceNumber = phoneNumber;
    }

    public int getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(int simNumber) {
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
