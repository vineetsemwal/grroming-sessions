package com.wiprotraining.saledemo.customerms.dto;

import com.wiprotraining.saledemo.productms.dto.ProductResponseDTO;
import com.wiprotraining.saledemo.productms.entities.Product;

import javax.persistence.ManyToMany;
import java.util.List;

public class CustomerDetails {

    private Long id;
    private String name;

    private List<ProductResponseDTO> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductResponseDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductResponseDTO> products) {
        this.products = products;
    }
}
