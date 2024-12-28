package com.simactivation.portal.SimService.repository;

import com.simactivation.portal.SimService.entity.SimDetails;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SimRepository extends CrudRepository<SimDetails,Integer> {

    Optional<SimDetails> findByServiceNumber(long phoneNumber);

    Optional<SimDetails> findByServiceNumberAndSimNumber(long serviceNumber, long simNumber);
}
