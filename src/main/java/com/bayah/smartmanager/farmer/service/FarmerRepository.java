package com.bayah.smartmanager.farmer.service;

import com.bayah.smartmanager.farmer.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {

    Optional<Farmer> findByMsisdn(String msisdn);

    List<Farmer> findByLastName(String lastName);

    List<Farmer> findByFirstName(String firstName);

    List<Farmer> findByFirstNameAndLastName(String firstName, String lastName);


}
