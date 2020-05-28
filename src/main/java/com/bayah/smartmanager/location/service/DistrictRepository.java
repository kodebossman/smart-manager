package com.bayah.smartmanager.location.service;

import com.bayah.smartmanager.location.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DistrictRepository extends JpaRepository<District, Long> {

    Optional<District> findByName(String name);

}
