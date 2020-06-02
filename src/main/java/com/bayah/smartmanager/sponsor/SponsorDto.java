package com.bayah.smartmanager.sponsor;

import com.bayah.smartmanager.common.BaseDto;
import com.bayah.smartmanager.location.DistrictDto;
import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class SponsorDto extends BaseDto implements Serializable {

    private String firstName;
    private String lastName;
    private String idNumber;
    private String msisdn;
    private SponsorType sponsorType;
    private String organization;

}
