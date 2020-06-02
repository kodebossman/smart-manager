package com.bayah.smartmanager.sponsor.service;

import com.bayah.smartmanager.sponsor.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SponsorRepository extends JpaRepository<Sponsor, Long> {

    Optional<Sponsor> findById(Long id);

}
