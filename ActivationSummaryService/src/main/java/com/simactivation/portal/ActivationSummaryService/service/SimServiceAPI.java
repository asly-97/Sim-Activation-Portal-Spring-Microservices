package com.simactivation.portal.ActivationSummaryService.service;

import com.simactivation.portal.ActivationSummaryService.dto.SimDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "SimService",url = "http://localhost:8000")
public interface SimServiceAPI {

    @GetMapping("/sim/details/{serviceNumber}")
    SimDetails getSimDetails(@PathVariable long serviceNumber);

}
