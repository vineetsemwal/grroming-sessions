package com.wiprotraining.saledemo.customerms.controller;

import com.wiprotraining.saledemo.customerms.dto.BuyProductRequest;
import com.wiprotraining.saledemo.customerms.dto.CustomerDetails;
import com.wiprotraining.saledemo.customerms.dto.RegisterCustomerRequest;
import com.wiprotraining.saledemo.customerms.exceptions.CustomerNotFoundException;
import com.wiprotraining.saledemo.customerms.services.ICustomerService;
import com.wiprotraining.saledemo.productms.dto.AddProductRequestDTO;
import com.wiprotraining.saledemo.productms.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/customers")
@RestController
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @PostMapping("/add")
    public CustomerDetails addCustomer(@RequestBody RegisterCustomerRequest request){
        CustomerDetails response=customerService.add(request);
        return response;
    }

    @GetMapping("/byid/{customerId}")
    public CustomerDetails fetchCustomerById(@PathVariable long customerId) throws CustomerNotFoundException {
        CustomerDetails resposne=customerService.findCustomerDetailsById(customerId);
        return resposne;
    }

    @PutMapping("/product/buy")
    public CustomerDetails buyProduct(@RequestBody  BuyProductRequest buyRequest)
            throws ProductNotFoundException,CustomerNotFoundException {
        CustomerDetails response=customerService.buyProduct(buyRequest);
        return response;
    }


}
