package com.bayah.smartmanager.location.service;

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
public class ProvinceServiceImpl implements ProvinceService{

    private final ProvinceRepository provinceRepository;

    @Override
    @Cacheable(cacheNames = {"locationCache"})
    public List<Province> getAll() {
        return provinceRepository.findAll();
    }
    @Override
    @Cacheable(cacheNames = {"locationCache"})
    public Province findById(Long id) {
        return provinceRepository.getOne(id);
    }

    @Override
    public Province register(Province province) {
        return provinceRepository.save(province);
    }

    @Override
    public Optional<Province> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Long total() {
        return provinceRepository.count();
    }

    @Override
    public Province update(Province province) {
        return provinceRepository.save(province);
    }

    @Override
    public List<Province> findAll(Pageable pageable) {
        return provinceRepository.findAll(pageable).getContent();
    }
}
