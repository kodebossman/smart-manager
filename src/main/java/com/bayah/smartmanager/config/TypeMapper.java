package com.bayah.smartmanager.config;

import com.bayah.smartmanager.farm.Department;
import com.bayah.smartmanager.farm.DepartmentDto;
import com.bayah.smartmanager.farmer.Farmer;
import com.bayah.smartmanager.farmer.FarmerDto;
import com.bayah.smartmanager.inputs.ProjectInputs;
import com.bayah.smartmanager.inputs.ProjectInputsDto;
import com.bayah.smartmanager.location.District;
import com.bayah.smartmanager.location.DistrictDto;
import com.bayah.smartmanager.location.Province;
import com.bayah.smartmanager.location.ProvinceDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface TypeMapper {


  Farmer map(FarmerDto farmerDto);

  FarmerDto map(Farmer farmer);

    Department map(DepartmentDto departmentDto);

    DepartmentDto map(Department department);

    Province map(ProvinceDto provinceDto);

    ProvinceDto map(Province province);

    District map(DistrictDto districtDto);

    DistrictDto map(District district);

    ProjectInputs map(ProjectInputsDto projectInputsDto);

    ProjectInputsDto map(ProjectInputs projectInputs);
}

