package com.bayah.smartmanager.location.service;

import com.bayah.smartmanager.location.District;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface LocationService {

 // List<District> getAll();

  //District findById(Long id);

  District register(District district);

  Optional<District> findByName(String name);

  Long total();

  District update(District district);


  List<District> findAll(Pageable pageable);
}
