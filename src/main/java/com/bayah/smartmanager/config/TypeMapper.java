package com.bayah.smartmanager.config;

import com.bayah.smartmanager.farmer.Farmer;
import com.bayah.smartmanager.farmer.FarmerDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface TypeMapper {


  Farmer map(FarmerDto farmerDto);

  FarmerDto map(Farmer farmer);
}

