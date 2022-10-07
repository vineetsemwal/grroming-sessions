package com.wiprotraining.saledemo.customerms.entity;

import com.wiprotraining.saledemo.productms.entities.Product;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @GeneratedValue
    @Id
    private Long id;
    private String name;

    @ManyToMany
    private List<Product>products;

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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
