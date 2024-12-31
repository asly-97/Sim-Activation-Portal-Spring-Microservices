package com.simactivation.portal.ActivationSummaryService.service;

import com.simactivation.portal.ActivationSummaryService.dto.ActivationSummary;
import com.simactivation.portal.ActivationSummaryService.dto.CustomerDetails;
import com.simactivation.portal.ActivationSummaryService.dto.SimDetails;
import com.simactivation.portal.ActivationSummaryService.exception.SAPException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class SummaryService {

    @Autowired
    private CustomerServiceAPI customerAPI;

    @Autowired
    private SimServiceAPI simAPI;

    public ActivationSummary getSummary(long serviceNumber) throws SAPException {

        CustomerDetails customerDetails = customerAPI.getCustomerDetails(serviceNumber);
        SimDetails simDetails = simAPI.getSimDetails(serviceNumber);

        ActivationSummary summary = new ActivationSummary();
        summary.setServiceNumber(simDetails.getServiceNumber());
        summary.setSimNumber(simDetails.getSimNumber());
        summary.setFirstname(customerDetails.getFirstname());
        summary.setLastname(customerDetails.getLastname());
        summary.setAddress(customerDetails.getAddress());
        summary.setEmail(customerDetails.getEmail());
        summary.setDateOfBirth(customerDetails.getDateOfBirth());

        return summary;
    }

}
