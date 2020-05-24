package com.bayah.smartmanager.location;


import com.bayah.smartmanager.common.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "district", indexes = {@Index(name = "id", columnList = "id", unique = true)})
@Getter
@Setter
@ToString
@Access(AccessType.FIELD)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class District extends BaseEntity {

  @Column
  private String name;

  @Column
  private int totalWards;

  @ManyToOne
  private Province province;

}
