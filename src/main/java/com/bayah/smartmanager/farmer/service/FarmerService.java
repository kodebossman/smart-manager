package com.bayah.smartmanager.farmer.service;

import com.bayah.smartmanager.farmer.Farmer;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface FarmerService {

    Farmer register(Farmer farmer);

    Optional<Farmer> findByMsisdn(String msisdn);

    List<Farmer> findByLastName(String lastName);

    List<Farmer> findByFirstName(String firstName);

    List<Farmer> findByFirstNameAndLastName(String firstName, String lastName);

    Long total();

    Farmer update(Farmer farmer);

    Farmer findAll(Pageable pageable);



}