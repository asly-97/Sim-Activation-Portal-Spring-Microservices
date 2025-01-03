package com.simactivation.portal.ActivationSummaryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ActivationSummaryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivationSummaryServiceApplication.class, args);
	}

}
