package com.bayah.smartmanager.plan;

import com.bayah.smartmanager.common.BaseEntity;
import com.bayah.smartmanager.location.District;
import com.bayah.smartmanager.project.ProjectType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "plan", indexes = {@Index(name = "indx_plan", columnList = "id", unique = true)})
@Getter
@Setter
@ToString
@Access(AccessType.FIELD)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class ProjectPlan extends BaseEntity {

  @Column(name = "plan_name", nullable = false, length = 45)
  private String planName;

  @Column(name = "created_by", nullable = false, length = 45)
  private String createdBy;

  @Column(name = "project_budget", nullable = false, length = 10)
  private int projectBudget;

  @Column(name = "start_date")

  private LocalDate startDate;

  @Column(name = "end_date")
  private LocalDate endDate;

  @Column(name = "production_amount")
  private String productionAmount;

  @Column(name = "project_type", nullable = false, length = 45)
  private ProjectType projectType;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "district_id", nullable = false)
  @JsonIgnore
  private District district;


}
