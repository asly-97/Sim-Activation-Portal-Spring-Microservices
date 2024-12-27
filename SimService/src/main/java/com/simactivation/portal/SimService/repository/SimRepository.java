package com.simactivation.portal.SimService.repository;

import com.simactivation.portal.SimService.dto.SimDTO;
import com.simactivation.portal.SimService.entity.SimDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SimRepository extends CrudRepository<SimDetails,Integer> {

    Optional<SimDetails> findByServiceNumber(int phoneNumber);

    Optional<SimDetails> findByServiceNumberAndSimNumber(int serviceNumber, int simNumber);
}
