package com.simactivation.portal.ActivationSummaryService.controller;


import com.simactivation.portal.CustomerService.dto.CustomerDTO;
import com.simactivation.portal.CustomerService.exception.SAPException;
import com.simactivation.portal.CustomerService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;


    @PostMapping("/validate")
    public ResponseEntity<String> validate(@RequestBody CustomerDTO customerDTO) throws SAPException {
        service.validate(customerDTO);
        return ResponseEntity.accepted().body("Email and DoB are validated");
    }

    @PostMapping("/details")
    public ResponseEntity<String> addDetails(@RequestBody CustomerDTO customerDTO) throws SAPException {
        return ResponseEntity.accepted().body(service.addDetails(customerDTO));
    }

    @PostMapping("/{serviceNumber}/address")
    public ResponseEntity<String> addAddress(@PathVariable Long serviceNumber, @RequestBody String address) throws SAPException {
        return ResponseEntity.accepted().body(service.addAddress(serviceNumber,address));
    }


}
