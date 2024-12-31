package com.simactivation.portal.ActivationSummaryService.service;


import com.simactivation.portal.ActivationSummaryService.dto.CustomerDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CustomerService",url = "http://localhost:8000")
public interface CustomerServiceAPI {

    @GetMapping("/customer/details/{serviceNumber}")
    CustomerDetails getCustomerDetails(@PathVariable long serviceNumber);

}
