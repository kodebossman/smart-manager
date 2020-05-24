package com.bayah.smartmanager.project;

import com.bayah.smartmanager.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "managers")
public class Manager extends BaseEntity {

    @Column(name="first_name", nullable = false, length = 45)
    private String firstName;

    @Column(name="last_name", nullable = false, length = 45)
    private String lastName;

    @Column(name = "id_number", unique = true, nullable = false, length = 10)
    private String idNumber;

    @Column(name="contact_number", unique = true, nullable = false, length = 12)
    private String contactNumber;

    @Column(name="location", length = 45)
    private String location;

    @Column(name = "province", nullable = false, length = 45)
    private String province;

    @Column(name = "district", nullable = false, length = 45)
    private String district;
}
