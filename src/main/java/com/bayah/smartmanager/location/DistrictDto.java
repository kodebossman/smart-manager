package com.bayah.smartmanager.location;

import com.bayah.smartmanager.common.BaseDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class DistrictDto extends BaseDto implements Serializable {
  private String name;
  private int totalWards;
  private Long province_id;
}
