package com.wiprotraining.saledemo.customerms.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @GeneratedValue
    @Id
    private Long id;
    private String name;

    @ElementCollection
    private List<Long>products;

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

    public List<Long> getProducts() {
        return products;
    }

    public void setProducts(List<Long> products) {
        this.products = products;
    }
}
