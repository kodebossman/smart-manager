package com.bayah.smartmanager.farm;

import com.bayah.smartmanager.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Department extends BaseEntity {

    @Column(name = "dept_name", nullable = false, length = 45)
    private String deptName;

    @Column(name = "description", nullable = false, length = 45)
    private String description;

    @Column(name = "supervisor", nullable = false, length = 45)
    private String deptSupervisor;


}
