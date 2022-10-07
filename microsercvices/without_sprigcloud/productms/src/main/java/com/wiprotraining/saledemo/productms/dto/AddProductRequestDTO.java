package com.wiprotraining.saledemo.productms.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * request data transfer object
 */
public class AddProductRequestDTO {

    @Length(min=2,max=20)
    @NotEmpty
    private String name;


    @Min(0)
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
