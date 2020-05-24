package com.bayah.smartmanager.farmer;

import com.bayah.smartmanager.common.BaseDto;
import com.bayah.smartmanager.location.DistrictDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class FarmerDto extends BaseDto implements Serializable {

  private String msisdn;
  private String firstName;
  private String lastName;
  private String idNumber;
  private DistrictDto district;
  private String latitude;
  private String longitude;
  private String village;

}
