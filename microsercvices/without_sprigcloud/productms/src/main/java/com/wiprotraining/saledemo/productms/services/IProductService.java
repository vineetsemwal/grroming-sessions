package com.wiprotraining.saledemo.productms.services;

import com.wiprotraining.saledemo.productms.dto.AddProductRequestDTO;
import com.wiprotraining.saledemo.productms.dto.ProductResponseDTO;
import com.wiprotraining.saledemo.productms.exceptions.ProductNotFoundException;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@Validated
public interface IProductService {

    ProductResponseDTO add(@Valid AddProductRequestDTO request);

    ProductResponseDTO findProductDetailsById(@Min(1) long productId) throws ProductNotFoundException;

}
