package com.bayah.smartmanager.inputs.api;

import com.bayah.smartmanager.common.ApiResponse;
import com.bayah.smartmanager.common.CrudApi;
import com.bayah.smartmanager.common.PaginationResult;
import com.bayah.smartmanager.config.TypeMapper;
import com.bayah.smartmanager.exception.BusinessException;
import com.bayah.smartmanager.farm.Department;
import com.bayah.smartmanager.farm.DepartmentDto;
import com.bayah.smartmanager.farm.service.DepartmentService;
import com.bayah.smartmanager.inputs.ProjectInputs;
import com.bayah.smartmanager.inputs.ProjectInputsDto;
import com.bayah.smartmanager.inputs.service.ProjectInputsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/projectInputs")
public class ProjectInputsApi implements CrudApi<ProjectInputsDto> {


    private  final ProjectInputsService projectInputsService;
    private final TypeMapper mapper;

    @PostMapping(value = "/register")
    public ApiResponse<ProjectInputsDto> register(@Valid @RequestBody ProjectInputsDto projectInputsDto) {
        log.info("New Registration : {} ", projectInputsDto);
        final ProjectInputs projectInputs = projectInputsService.register(mapper.map(projectInputsDto));
        return new ApiResponse<>(HttpStatus.OK.value(), mapper.map(projectInputs));
    }

    @Override
    public ApiResponse<ProjectInputsDto> create(ProjectInputsDto projectInputsDto) {
        log.info("New Registration : {} ", projectInputsDto);
        final ProjectInputs projectInputs = projectInputsService.register(mapper.map(projectInputsDto));
        return new ApiResponse<>(HttpStatus.OK.value(), mapper.map(projectInputs));
    }

    @Override
    public ApiResponse<ProjectInputsDto> update(ProjectInputsDto projectInputsDto) {
        log.info("Update Existing Input : {} ", projectInputsDto);
        final ProjectInputs projectInputs = projectInputsService.update(mapper.map(projectInputsDto));
        return new ApiResponse<>(HttpStatus.OK.value(), mapper.map(projectInputs));
    }

    @Override
    public ApiResponse<ProjectInputsDto> delete(ProjectInputsDto projectInputsDto) {
        return null;
    }

    @Override
    public ApiResponse<PaginationResult<ProjectInputsDto>> findAll(String search, Integer page, Integer size, String sortBy) {
        List<ProjectInputsDto> projectInputsDtos = projectInputsService.findAll(PageRequest.of(page - 1, size, Sort.by(sortBy)))
                .stream()
                .map(mapper::map)
                .collect(Collectors.toList());

        PaginationResult<ProjectInputsDto> pagedProjectInput = PaginationResult.pagination(projectInputsDtos, projectInputsService.total(), page, size);
        return new ApiResponse<>(HttpStatus.OK.value(), pagedProjectInput);
    }

    @Override
    public ApiResponse<ProjectInputsDto> find(Long id) {
        final Optional<ProjectInputs> projectInputs = projectInputsService.findById(id);
        return projectInputs.map(projectInputs1-> new ApiResponse<>(HttpStatus.OK.value(), mapper.map(projectInputs1)))
                .orElseThrow(() -> new BusinessException("Input with Id " + id + "not found"));
    }


}
