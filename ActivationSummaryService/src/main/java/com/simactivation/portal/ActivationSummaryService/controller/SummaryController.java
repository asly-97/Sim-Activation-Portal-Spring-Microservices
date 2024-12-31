package com.simactivation.portal.ActivationSummaryService.controller;

import com.simactivation.portal.ActivationSummaryService.dto.ActivationSummary;
import com.simactivation.portal.ActivationSummaryService.exception.SAPException;
import com.simactivation.portal.ActivationSummaryService.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummaryController {

    @Autowired
    private SummaryService service;

    @GetMapping("/summary/{serviceNumber}")
    public ResponseEntity<ActivationSummary> getSummary(@PathVariable long serviceNumber) throws SAPException {
        return new ResponseEntity<>(service.getSummary(serviceNumber), HttpStatus.OK);
    }

}
