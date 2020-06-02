package com.bayah.smartmanager.project;

import com.bayah.smartmanager.common.BaseDto;
import com.bayah.smartmanager.farmer.Farmer;
import com.bayah.smartmanager.sponsor.Sponsor;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ProjectDto extends BaseDto {

    private String projectName;
    private  ProjectType projectType;
    private Farmer farmer;
    private Sponsor sponsor;
    private String description;
    private String duration;

}
