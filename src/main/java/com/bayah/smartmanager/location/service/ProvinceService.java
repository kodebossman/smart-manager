package com.bayah.smartmanager.location.service;


import com.bayah.smartmanager.location.Province;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProvinceService {


    List<Province> getAll();

    Province findById(Long id);

    Province register(Province province);

    Optional<Province> findByName(String name);

    Long total();

    Province update(Province province);


    List<Province> findAll(Pageable pageable);
}
