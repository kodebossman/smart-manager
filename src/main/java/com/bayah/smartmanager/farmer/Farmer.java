package com.bayah.smartmanager.farmer;

import com.bayah.smartmanager.common.BaseEntity;
import com.bayah.smartmanager.location.District;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "farmers", indexes = {@Index(name = "indx_activity", columnList = "msisdn", unique = true)})
@Getter
@Setter
@ToString
@Access(AccessType.FIELD)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Farmer extends BaseEntity {

    @Column(name="first_name", nullable = false, length = 45)
    private String firstName;

    @Column(name="last_name", nullable = false, length = 45)
    private String lastName;

    @Column(name = "id_number", unique = true, nullable = false, length = 10)
    private String idNumber;

    @Column(name="msisdn", unique = true, nullable = false, length = 12)
    private String msisdn;

    @Column(name="location", length = 45)
    private String location;

    @Column(name = "province", nullable = false, length = 45)
    private String province;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "district_id", nullable = false)
    @JsonIgnore
    private District district;

}
