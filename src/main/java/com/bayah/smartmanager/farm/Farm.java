package com.bayah.smartmanager.farm;

import com.bayah.smartmanager.common.BaseEntity;
import com.bayah.smartmanager.farmer.Farmer;

import javax.persistence.*;

@Entity
@Table(name = "farms")
public class Farm extends BaseEntity {

    @Column(name = "farm_name", nullable = false, length = 45)
    private String name;

    @Column(name = "farm_type", nullable = false, length = 45)
    private String type;

    @Column(name = "farm_size", nullable = false, length = 45)
    private String farmSize;

    @Column(name = "farm_province", nullable = false, length = 45)
    private String province;

    @Column(name = "farm_district", nullable = false, length = 45)
    private String district;

    @Column(name = "farm_location", length = 45)
    private String location;
}
