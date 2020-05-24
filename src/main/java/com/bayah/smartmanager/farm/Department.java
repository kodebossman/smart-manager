package com.bayah.smartmanager.farm;

import com.bayah.smartmanager.common.BaseEntity;
import com.bayah.smartmanager.project.Project;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

public class Department extends BaseEntity {

  @Column(name = "dept_name", nullable = false, length = 45)
  private String deptName;

  @Column(name = "description", nullable = false, length = 45)
  private String description;

  @Column(name = "supervisor", nullable = false, length = 45)
  private String deptSupervisor;

  @ManyToOne(fetch = FetchType.LAZY, optional = true)
  @JoinColumn(name = "projects_id", nullable = false)
  @JsonIgnore
  private Farm farm;


}
