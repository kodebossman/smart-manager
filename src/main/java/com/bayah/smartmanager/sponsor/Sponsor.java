package com.bayah.smartmanager.sponsor;

import com.bayah.smartmanager.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "sponsors")
public class Sponsor extends BaseEntity {

    @Column(name="first_name", length = 45)
    private String firstName;

    @Column(name="last_name", length = 45)
    private String lastName;

    @Column(name = "id_number", unique = true, length = 10)
    private String idNumber;

    @Column(name="contact_number", unique = true, nullable = false, length = 12)
    private String contactNumber;

    @Column(name="sponsor_type", unique = true, nullable = false, length = 45)
    private SponsorType sponsorType;

    @Column(name="organization", length = 45)
    private String organization;
}
