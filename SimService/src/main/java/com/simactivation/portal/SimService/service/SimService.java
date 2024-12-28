package com.simactivation.portal.SimService.service;

import com.simactivation.portal.SimService.dto.SimDTO;
import com.simactivation.portal.SimService.entity.SimDetails;
import com.simactivation.portal.SimService.exception.InvalidSIMException;
import com.simactivation.portal.SimService.exception.SAPException;
import com.simactivation.portal.SimService.exception.SIMAlreadyActivatedException;
import com.simactivation.portal.SimService.exception.SimNotFoundException;
import com.simactivation.portal.SimService.repository.SimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimService {

    @Autowired
    private SimRepository repository;

    public SimDetails getDetails(long serviceNumber) throws SAPException {
        SimDetails simDetails = repository
                .findByServiceNumber(serviceNumber)
                .orElseThrow(SimNotFoundException::new);

        return simDetails;
    }

    public String validate(SimDTO simDTO)  throws SAPException {
        repository
                .findByServiceNumberAndSimNumber(simDTO.getServiceNumber(), simDTO.getSimNumber())
                .orElseThrow(InvalidSIMException::new);

        return "SIM is validated";
    }

    public String activate(SimDTO simDTO)  throws SAPException {
        SimDetails sim = repository
                .findByServiceNumberAndSimNumber(simDTO.getServiceNumber(),simDTO.getSimNumber())
                .orElseThrow(InvalidSIMException::new);

        if(sim.isActivated()){
            throw new SIMAlreadyActivatedException();
        }

        sim.setActivated(true);
        repository.save(sim);
        return "SIM is activated successfully.";
    }



}
