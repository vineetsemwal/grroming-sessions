package com.wiprotraining.saledemo.customerms.services;

import com.wiprotraining.saledemo.customerms.dto.BuyProductRequest;
import com.wiprotraining.saledemo.customerms.dto.CustomerDetails;
import com.wiprotraining.saledemo.customerms.dto.RegisterCustomerRequest;
import com.wiprotraining.saledemo.customerms.exceptions.CustomerNotFoundException;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@Validated
public interface ICustomerService {
     CustomerDetails add(@Valid RegisterCustomerRequest request);

     CustomerDetails findCustomerDetailsById(@Min(1) long id)throws CustomerNotFoundException;

     CustomerDetails buyProduct(BuyProductRequest request)throws CustomerNotFoundException;

}
