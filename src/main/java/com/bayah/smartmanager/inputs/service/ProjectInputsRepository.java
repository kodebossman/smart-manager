package com.bayah.smartmanager.inputs.service;

import com.bayah.smartmanager.inputs.ProjectInputs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectInputsRepository extends JpaRepository<ProjectInputs, Long> {
    Optional<ProjectInputs> findBySerialNo(String serialNo);

    Optional<ProjectInputs> findByName(String name);
}
