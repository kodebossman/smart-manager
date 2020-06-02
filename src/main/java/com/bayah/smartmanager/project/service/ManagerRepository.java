package com.bayah.smartmanager.project.service;

import com.bayah.smartmanager.project.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ManagerRepository extends JpaRepository<Manager, Long> {

    Optional<Manager> findByMsisdn(String msisdn);

}
