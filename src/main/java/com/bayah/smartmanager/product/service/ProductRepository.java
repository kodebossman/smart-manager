package com.bayah.smartmanager.product.service;


import com.bayah.smartmanager.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByName(String name);

    Optional<Product> findByProductCode(String productCode);
}
