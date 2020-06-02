package com.bayah.smartmanager.merchant.api;

import com.bayah.smartmanager.common.ApiResponse;
import com.bayah.smartmanager.common.CrudApi;
import com.bayah.smartmanager.common.PaginationResult;
import com.bayah.smartmanager.config.TypeMapper;
import com.bayah.smartmanager.merchant.Supplier;
import com.bayah.smartmanager.merchant.SupplierDto;
import com.bayah.smartmanager.merchant.service.SupplierService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/supplier")
public class SupplierApi implements CrudApi<SupplierDto> {

    private final SupplierService supplierService;
    private final TypeMapper mapper;

    @PostMapping(value = "/register")
    public ApiResponse<SupplierDto> register(@Valid @RequestBody SupplierDto supplierDto) {
        log.info("New supplier registration : {} ", supplierDto);
        final Supplier supplier = supplierService.register(mapper.map(supplierDto));
        return new ApiResponse<>(HttpStatus.OK.value(), mapper.map(supplier));
    }

    @Override
    public ApiResponse<SupplierDto> create(SupplierDto supplierDto) {
        log.info("New supplier registration : {}", supplierDto );
        Supplier supplier = supplierService.register(mapper.map(supplierDto));
        return new  ApiResponse<>(HttpStatus.OK.value(), mapper.map(supplier));
    }

    @Override
    public ApiResponse<SupplierDto> update(SupplierDto supplierDto) {
        log.info("Updating existing supplier details: {}", supplierDto);
        Supplier supplier = supplierService.register(mapper.map(supplierDto));
        return new ApiResponse<>(HttpStatus.OK.value(), mapper.map(supplier));
    }

    @Override
    public ApiResponse<SupplierDto> delete(SupplierDto supplierDto) {
        return null;
    }

    @Override
    public ApiResponse<PaginationResult<SupplierDto>> findAll(String search, Integer page, Integer size, String sortBy) {
        return null;
    }

    @Override
    public ApiResponse<SupplierDto> find(Long id) {
        return null;
    }
}
