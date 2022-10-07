package com.wiprotraining.saledemo.productms.util;

import com.wiprotraining.saledemo.productms.dto.ProductResponseDTO;
import com.wiprotraining.saledemo.productms.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class ProductUtil {

    public ProductResponseDTO toProductResponse(Product product){
        ProductResponseDTO desired=new ProductResponseDTO();
        desired.setId(product.getId());
        desired.setName(product.getName());
        desired.setPrice(product.getPrice());
        return desired;
    }

    public List<ProductResponseDTO>toProductResponseList(Collection<Product>products){
        List<ProductResponseDTO>desiredList=new ArrayList<>();
        for (Product product:products){
           ProductResponseDTO desired= toProductResponse(product);
           desiredList.add(desired);
        }
        return desiredList;
    }

}
