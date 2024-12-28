package com.simactivation.portal.SimService.controller;

import com.simactivation.portal.SimService.dto.SimDTO;
import com.simactivation.portal.SimService.entity.SimDetails;
import com.simactivation.portal.SimService.exception.SAPException;
import com.simactivation.portal.SimService.service.SimService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/sim")
public class SimController {

    @Autowired
    private SimService service;

    @GetMapping("/details/{serviceNumber}")
    public ResponseEntity<SimDetails> getSimDetails(@PathVariable long serviceNumber) throws SAPException {
        return new ResponseEntity<>(service.getDetails(serviceNumber), HttpStatus.OK);
    }

    @PostMapping("/validate")
    public ResponseEntity<String> validate(@RequestBody @Valid SimDTO simDTO) throws SAPException {
        return new ResponseEntity<>(service.validate(simDTO), HttpStatus.OK);
    }

    @PostMapping("/activate")
    public ResponseEntity<String> activate(@RequestBody @Valid SimDTO simDTO) throws SAPException {
        return new ResponseEntity<>(service.activate(simDTO), HttpStatus.ACCEPTED);
    }

}
