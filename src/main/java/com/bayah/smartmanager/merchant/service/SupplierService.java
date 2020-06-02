package com.bayah.smartmanager.merchant.service;

import com.bayah.smartmanager.merchant.Supplier;

import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

public interface SupplierService {

    Supplier register(Supplier supplier);

    Optional<Supplier> findById(Long id);

    Optional<Supplier> findByName(String name);

    Long total();

    Supplier update(Supplier supplier);

    List<Supplier> findAll(Pageable pageable);
}
