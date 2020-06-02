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
import com.bayah.smartmanager.merchant.Supplier;
import com.bayah.smartmanager.merchant.SupplierDto;
import com.bayah.smartmanager.product.Product;
import com.bayah.smartmanager.product.ProductDto;
import com.bayah.smartmanager.project.Manager;
import com.bayah.smartmanager.project.ManagerDto;
import com.bayah.smartmanager.sponsor.Sponsor;
import com.bayah.smartmanager.sponsor.SponsorDto;
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

    Supplier map(SupplierDto supplierDto);

    SupplierDto map(Supplier supplier);

    Product map(ProductDto productDto);

    ProductDto map(Product product);

    Sponsor map(SponsorDto sponsorDto);

    SponsorDto map(Sponsor sponsor);

    Manager map(ManagerDto managerDto);

    ManagerDto map(Manager manager);
}

