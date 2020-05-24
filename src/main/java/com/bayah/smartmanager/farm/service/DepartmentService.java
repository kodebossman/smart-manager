package com.bayah.smartmanager.farm.service;

import com.bayah.smartmanager.farm.Department;
import com.bayah.smartmanager.farmer.Farmer;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    Department register(Department department);

    Optional<Department> findByDeptName(String deptName);

    Optional<Department> findById(Long id);

    Long total();

    Department update(Department department);


    List<Department> findAll(Pageable pageable);
}
