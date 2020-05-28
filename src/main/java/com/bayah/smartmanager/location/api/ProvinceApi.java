package com.bayah.smartmanager.location.api;

import com.bayah.smartmanager.common.ApiResponse;
import com.bayah.smartmanager.common.CrudApi;
import com.bayah.smartmanager.common.PaginationResult;
import com.bayah.smartmanager.config.TypeMapper;
import com.bayah.smartmanager.farm.Department;
import com.bayah.smartmanager.farm.DepartmentDto;
import com.bayah.smartmanager.location.Province;
import com.bayah.smartmanager.location.ProvinceDto;
import com.bayah.smartmanager.location.service.ProvinceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/province")
@Slf4j
@RequiredArgsConstructor
public class ProvinceApi implements CrudApi<ProvinceDto> {

    private final ProvinceService provinceService;
    private  final TypeMapper mapper;

    @PostMapping(value = "/register")
    public ApiResponse<ProvinceDto> register(@Valid @RequestBody ProvinceDto provinceDto) {
        log.info("New Registration : {} ", provinceDto);
        final Province province = provinceService.register(mapper.map(provinceDto));
        return new ApiResponse<>(HttpStatus.OK.value(), mapper.map(province));
    }

    @Override
    public ApiResponse<ProvinceDto> create(ProvinceDto provinceDto) {
        return null;
    }

    @Override
    public ApiResponse<ProvinceDto> update(ProvinceDto provinceDto) {
        return null;
    }

    @Override
    public ApiResponse<ProvinceDto> delete(ProvinceDto provinceDto) {
        return null;
    }

    @Override
    public ApiResponse<PaginationResult<ProvinceDto>> findAll(String search, Integer page, Integer size, String sortBy) {
        return null;
    }

    @Override
    public ApiResponse<ProvinceDto> find(Long id) {
        return null;
    }
}
