package com.simactivation.portal.ActivationSummaryService.repository;

import com.simactivation.portal.CustomerService.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {

    Optional<Customer> findByPhoneNumber(Long phoneNumber);

}
