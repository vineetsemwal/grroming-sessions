package com.wiprotraining.saledemo.productms.controller;

import com.wiprotraining.saledemo.productms.dto.AddProductRequestDTO;
import com.wiprotraining.saledemo.productms.dto.ProductResponseDTO;
import com.wiprotraining.saledemo.productms.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private IProductService service;

    @PostMapping("/add")
    public ProductResponseDTO add(@RequestBody AddProductRequestDTO requestData){
        ProductResponseDTO response=service.add(requestData);
        return response;
    }

    @GetMapping("/byid/{productId}")
    public ProductResponseDTO findById(@PathVariable long productId)throws Exception{
        ProductResponseDTO response=service.findProductDetailsById(productId);
        return response;
    }


}
