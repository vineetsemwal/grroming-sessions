package com.wiprotraining.saledemo.productms.services;

import com.wiprotraining.saledemo.productms.dto.AddProductRequestDTO;
import com.wiprotraining.saledemo.productms.dto.ProductResponseDTO;
import com.wiprotraining.saledemo.productms.entities.Product;
import com.wiprotraining.saledemo.productms.exceptions.ProductNotFoundException;
import com.wiprotraining.saledemo.productms.repositories.IProductRepository;
import com.wiprotraining.saledemo.productms.util.ProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    private IProductRepository repository;

    @Autowired
    private ProductUtil productUtil;

    @Transactional
    @Override
    public ProductResponseDTO add(AddProductRequestDTO request) {
        Product product=new Product();
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        product=repository.save(product);
        ProductResponseDTO desired=productUtil.toProductResponse(product);
        return desired;
    }

    @Override
    public ProductResponseDTO findProductDetailsById(long productId) throws ProductNotFoundException{
       Optional<Product>optional =repository.findById(productId);
       if(!optional.isPresent()){
           throw new ProductNotFoundException("product not found for id="+productId);
       }
       Product product= optional.get();
        ProductResponseDTO desired=productUtil.toProductResponse(product);
        return desired;

    }
}
