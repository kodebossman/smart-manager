package com.bayah.smartmanager.inputs;

import com.bayah.smartmanager.common.BaseDto;
import com.bayah.smartmanager.merchant.SupplierDto;
import lombok.Data;


import java.io.Serializable;

@Data
public class ProjectInputsDto extends BaseDto implements Serializable {

    private String serialNo;
    private String name;
    private double quantity;
    private double price;
    private SupplierDto supplier;
}
