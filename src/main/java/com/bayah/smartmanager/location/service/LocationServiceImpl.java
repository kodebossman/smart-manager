package com.bayah.smartmanager.location.service;


import com.bayah.smartmanager.location.District;
import com.bayah.smartmanager.location.Province;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
@CacheConfig(cacheNames = {"locationCache"})
public class LocationServiceImpl implements LocationService {

  private final DistrictRepository districtRepository;

  @Override
  public District register(District district) {
    return districtRepository.save(district);
  }

  @Override
  public Optional<District> findByName(String name) {
    return districtRepository.findByName(name);
  }

  @Override
  public Long total() {
    return districtRepository.count();
  }

  @Override
  public District update(District district) {
    return districtRepository.save(district);
  }

  @Override
  public List<District> findAll(Pageable pageable) {
    return districtRepository.findAll(pageable).getContent();
  }
}
