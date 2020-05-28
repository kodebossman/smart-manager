package com.bayah.smartmanager.location.api;


import com.bayah.smartmanager.common.ApiResponse;
import com.bayah.smartmanager.common.CrudApi;
import com.bayah.smartmanager.common.PaginationResult;
import com.bayah.smartmanager.config.TypeMapper;
import com.bayah.smartmanager.location.District;
import com.bayah.smartmanager.location.DistrictDto;
import com.bayah.smartmanager.location.Province;
import com.bayah.smartmanager.location.ProvinceDto;
import com.bayah.smartmanager.location.service.LocationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/location")
@Slf4j
@RequiredArgsConstructor
public class LocationApi implements CrudApi<DistrictDto> {

  private final LocationService locationService;
  private final TypeMapper mapper;

  @PostMapping(value = "/register")
  public ApiResponse<DistrictDto> register(@Valid @RequestBody DistrictDto districtDto) {
    log.info("New Registration : {} ", districtDto);
    final District district = locationService.register(mapper.map(districtDto));
    return new ApiResponse<>(HttpStatus.OK.value(), mapper.map(district));
  }

  @Override
  public ApiResponse<DistrictDto> create(DistrictDto districtDto) {
    return null;
  }

  @Override
  public ApiResponse<DistrictDto> update(DistrictDto districtDto) {
    return null;
  }

  @Override
  public ApiResponse<DistrictDto> delete(DistrictDto districtDto) {
    return null;
  }

  @Override
  public ApiResponse<PaginationResult<DistrictDto>> findAll(String search, Integer page, Integer size, String sortBy) {
    return null;
  }

  @Override
  public ApiResponse<DistrictDto> find(Long id) {
    return null;
  }

//  @GetMapping(value = "/provinces")
//  public ApiResponse<List<ProvinceDto>> getAll() {
//    List<ProvinceDto> provinceDtos = locationService.getAll()
//      .stream()
//      .map(mapper::map)
//      .collect(Collectors.toList());
//    return new ApiResponse<>(HttpStatus.OK.value(), provinceDtos);
//  }

//  @GetMapping(value = "/provinces/{id}")
//  public ApiResponse<ProvinceDto> get(@PathVariable Long id) {
//    final Province province = locationService.findById(id);
//    return new ApiResponse<ProvinceDto>(HttpStatus.OK.value(), mapper.map(province));
//  }

}
