package com.wiprotraining.saledemo.customerms.util;

import com.wiprotraining.saledemo.customerms.dto.CustomerDetails;
import com.wiprotraining.saledemo.customerms.entity.Customer;
import com.wiprotraining.saledemo.productms.dto.ProductResponseDTO;
import com.wiprotraining.saledemo.productms.entities.Product;
import com.wiprotraining.saledemo.productms.util.ProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerUtil {

    @Autowired
    private ProductUtil productUtil;

    public CustomerDetails toCustomerDetails(Customer customer){
        CustomerDetails desired=new CustomerDetails();
        desired.setId(customer.getId());
        desired.setName(customer.getName());
        List<Product>products=customer.getProducts();
        if(products!=null) {
            List<ProductResponseDTO>productDtosList=productUtil.toProductResponseList(products);
            desired.setProducts(productDtosList);
        }
        return desired;
    }

}
