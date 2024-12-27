package com.simactivation.portal.SimService.service;

import com.simactivation.portal.SimService.dto.SimDTO;
import com.simactivation.portal.SimService.entity.SimDetails;
import com.simactivation.portal.SimService.exception.SimNotFoundException;
import com.simactivation.portal.SimService.repository.SimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SimService {

    @Autowired
    private SimRepository repository;

    public SimDTO getDetails(int serviceNumber){
        SimDetails simDetails = repository
                .findByServiceNumber(serviceNumber)
                .orElseThrow(SimNotFoundException::new);

        SimDTO simDTO = new SimDTO(serviceNumber,simDetails.getSimNumber());

        return simDTO;
    }

    public String validate(SimDTO simDTO){
        Optional<SimDetails> opt = repository
                .findByServiceNumberAndSimNumber(simDTO.getServiceNumber(), simDTO.getSimNumber());

        if(opt.isPresent()){
            return "SIM is validated";
        }
        else{
            return "SIM details are not valid";
        }
    }

    public String activate(SimDTO simDTO){
        SimDetails simDetails = repository
                .findByServiceNumberAndSimNumber(simDTO.getServiceNumber(),simDTO.getSimNumber())
                .orElseThrow(SimNotFoundException::new);





    }



}
