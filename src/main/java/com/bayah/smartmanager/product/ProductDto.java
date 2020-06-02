package com.bayah.smartmanager.product;

import com.bayah.smartmanager.batches.Batches;
import com.bayah.smartmanager.common.BaseDto;
import com.bayah.smartmanager.project.Project;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class ProductDto extends BaseDto implements Serializable {

    private String productCode;
    private String name;
    private String description;
    private double quantity;
    private double price;
    private Project project;
    private Batches batches;

}
