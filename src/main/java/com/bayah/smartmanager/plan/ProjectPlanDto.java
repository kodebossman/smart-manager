package com.bayah.smartmanager.plan;

import com.bayah.smartmanager.common.BaseDto;
import com.bayah.smartmanager.location.DistrictDto;
import com.bayah.smartmanager.project.ProjectType;
import lombok.Data;


import java.io.Serializable;
import java.time.LocalDate;

@Data
public class ProjectPlanDto extends BaseDto implements Serializable {

    private String planName;
    private String createdBy;
    private int projectBudget;
    private LocalDate startDate;
    private LocalDate endDate;
    private String productionAmount;
    private ProjectType projectType;
    private DistrictDto district;

}
