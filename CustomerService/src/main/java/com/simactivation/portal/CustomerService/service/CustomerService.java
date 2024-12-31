package com.simactivation.portal.CustomerService.service;

import com.simactivation.portal.CustomerService.dto.CustomerDTO;
import com.simactivation.portal.CustomerService.entity.Customer;
import com.simactivation.portal.CustomerService.exception.CustomerNotFoundException;
import com.simactivation.portal.CustomerService.exception.SAPException;
import com.simactivation.portal.CustomerService.exception.UnregisteredPhoneNumberException;
import com.simactivation.portal.CustomerService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;


    public String validate(CustomerDTO customerDTO) throws SAPException {
        Long serviceNumber = customerDTO.getServiceNumber();
        Customer customer = repository.findByPhoneNumber(serviceNumber)
                .orElseThrow(UnregisteredPhoneNumberException::new);

        if( !customer.getEmail().equals(customerDTO.getEmail())
        || !customer.getDateOfBirth().isEqual(LocalDate.parse(customerDTO.getDateOfBirth(),DateTimeFormatter.ofPattern("dd/MM/yyyy")))){
            throw new CustomerNotFoundException();
        }

        return "Email and DoB are validated";
    }

    public String addDetails(CustomerDTO customerDTO) throws UnregisteredPhoneNumberException {
        Long serviceNumber = customerDTO.getServiceNumber();
        Customer customer = repository.findByPhoneNumber(serviceNumber)
                .orElseThrow(UnregisteredPhoneNumberException::new);
        customer.setFirstname(customerDTO.getFirstname());
        customer.setLastname(customerDTO.getLastname());
        repository.save(customer);
        return "Details updated successfully.";
    }

    public String addAddress(Long serviceNumber, String address) throws UnregisteredPhoneNumberException {
        Customer customer = repository.findByPhoneNumber(serviceNumber)
                .orElseThrow(UnregisteredPhoneNumberException::new);
        customer.setAddress(address);
        repository.save(customer);
        return "Address updated successfully.";
    }
}
