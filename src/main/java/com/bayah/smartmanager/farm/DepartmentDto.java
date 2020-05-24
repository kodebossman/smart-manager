package com.bayah.smartmanager.farm;

import com.bayah.smartmanager.common.BaseDto;
import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class DepartmentDto extends BaseDto implements Serializable {

    private String deptName;
    private String deptType;
    private String description;

}
