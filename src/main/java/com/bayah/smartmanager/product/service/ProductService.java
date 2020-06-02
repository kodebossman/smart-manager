package com.bayah.smartmanager.product.service;

import com.bayah.smartmanager.product.Product;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface ProductService {

    Product register(Product product);

    Product update(Product product);

    Product delete(Product product);

    Long total();

    List<Product> findAll(Pageable pageable);

}
