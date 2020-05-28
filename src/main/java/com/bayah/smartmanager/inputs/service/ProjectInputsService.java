package com.bayah.smartmanager.inputs.service;

import com.bayah.smartmanager.farm.Department;
import com.bayah.smartmanager.inputs.ProjectInputs;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProjectInputsService {

    ProjectInputs register(ProjectInputs projectInputs);

    Optional<ProjectInputs> findByName(String name);

    Optional<ProjectInputs> findBySerialNo(String serialNo);

    Long total();

    ProjectInputs update(ProjectInputs projectInputs);


    List<ProjectInputs> findAll(Pageable pageable);

    Optional<ProjectInputs> findById(Long id);
}
