package com.bayah.smartmanager.project;

import com.bayah.smartmanager.common.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class ManagerDto extends BaseEntity implements Serializable {

    private String firstName;
    private String lastName;
    private String idNumber;
    private String contactNumber;
    private String location;
    private String province;
    private String district;


}
