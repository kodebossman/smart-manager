package com.bayah.smartmanager.location.service;

import com.bayah.smartmanager.location.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProvinceRepository extends JpaRepository<Province, Long> {

    Optional<Province> findByName(String name);
}
