package com.bayah.smartmanager.project.api;

import com.bayah.smartmanager.common.ApiResponse;
import com.bayah.smartmanager.common.CrudApi;
import com.bayah.smartmanager.common.PaginationResult;
import com.bayah.smartmanager.config.TypeMapper;
import com.bayah.smartmanager.project.Manager;
import com.bayah.smartmanager.project.ManagerDto;
import com.bayah.smartmanager.project.service.ManagerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/manager")
public class ManagerApi implements CrudApi<ManagerDto> {

    private final ManagerService managerService;
    private final TypeMapper mapper;

    @PostMapping(value = "/register")
    public ApiResponse<ManagerDto> register(ManagerDto managerDto){
        log.info("New manager registration: {}", managerDto);
        Manager manager = managerService.register(mapper.map(managerDto));
        return new ApiResponse<>(HttpStatus.OK.value(), mapper.map(manager));
    }

    @Override
    public ApiResponse<ManagerDto> create(ManagerDto managerDto) {
        log.info("New manager registration: {}", managerDto);
        Manager manager = managerService.register(mapper.map(managerDto));
        return new ApiResponse<>(HttpStatus.OK.value(), mapper.map(manager));
    }

    @Override
    public ApiResponse<ManagerDto> update(ManagerDto managerDto) {
        log.info("Updating existing manager: {}", managerDto);
        Manager manager = managerService.register(mapper.map(managerDto));
        return new ApiResponse<>(HttpStatus.OK.value(), mapper.map(manager));
    }

    @Override
    public ApiResponse<ManagerDto> delete(ManagerDto managerDto) {
        return null;
    }

    @Override
    public ApiResponse<PaginationResult<ManagerDto>> findAll(String search, Integer page, Integer size, String sortBy) {
        return null;
    }

    @Override
    public ApiResponse<ManagerDto> find(Long id) {
        return null;
    }
}
