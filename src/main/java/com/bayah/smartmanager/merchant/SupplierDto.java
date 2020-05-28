package com.bayah.smartmanager.merchant;

import com.bayah.smartmanager.common.BaseDto;
import com.bayah.smartmanager.location.DistrictDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class SupplierDto extends BaseDto implements Serializable {

    private String name;
    private String msisdn;
    private MerchantType merchantType;
    private DistrictDto district;
    private String longitude;
    private String latitude;
    private String growthPoint;

}
