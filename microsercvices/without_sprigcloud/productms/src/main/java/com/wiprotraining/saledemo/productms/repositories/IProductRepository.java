package com.wiprotraining.saledemo.productms.repositories;

import com.wiprotraining.saledemo.productms.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
