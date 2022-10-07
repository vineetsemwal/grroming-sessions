package com.wiprotraining.saledemo.customerms.util;

import com.wiprotraining.saledemo.customerms.dto.BuyProductRequest;
import com.wiprotraining.saledemo.customerms.dto.CustomerDetails;
import com.wiprotraining.saledemo.customerms.dto.ProductDetails;
import com.wiprotraining.saledemo.customerms.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class CustomerUtil {

    @Value("${productms.baseUrl}")
    private String baseProductUrl;

    @Autowired
    private RestTemplate restTemplate;

    public CustomerDetails toCustomerDetails(Customer customer){
        CustomerDetails desired=new CustomerDetails();
        desired.setId(customer.getId());
        desired.setName(customer.getName());
        List<Long>products=customer.getProducts();
        if(products!=null) {
            List<ProductDetails>productDtosList=findProductById(products);
            desired.setProducts(productDtosList);
        }
        return desired;
    }


    List<ProductDetails>findProductById(Collection<Long>ids){
        List<ProductDetails>desiredList=new ArrayList<>();
        for (Long id:ids){
          ProductDetails desired= fetchProductById(id);
          desiredList.add(desired);
        }
        return desiredList;
    }

    ProductDetails fetchProductById(long productId){
        String url=baseProductUrl+"/products/byid/"+productId;
        ProductDetails desired=restTemplate.getForObject(url,ProductDetails.class);
        return desired;
    }

}
