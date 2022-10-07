package com.wiprotraining.saledemo.customerms.services;

import com.wiprotraining.saledemo.customerms.dao.ICustomerRepository;
import com.wiprotraining.saledemo.customerms.dto.BuyProductRequest;
import com.wiprotraining.saledemo.customerms.dto.CustomerDetails;
import com.wiprotraining.saledemo.customerms.dto.RegisterCustomerRequest;
import com.wiprotraining.saledemo.customerms.entity.Customer;
import com.wiprotraining.saledemo.customerms.exceptions.CustomerNotFoundException;
import com.wiprotraining.saledemo.customerms.util.CustomerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService{

    @Autowired
   private ICustomerRepository customerRepo;


    @Autowired
    private CustomerUtil customerUtil;

    @Override
    public CustomerDetails add(RegisterCustomerRequest request) {
        Customer customer=new Customer();
        customer.setName(request.getName());
        customer=customerRepo.save(customer);
       CustomerDetails desired=customerUtil.toCustomerDetails(customer);
       return desired;
    }

    @Override
    public CustomerDetails findCustomerDetailsById(long id)throws CustomerNotFoundException {
        Customer customer=findById(id);
        CustomerDetails desired=customerUtil.toCustomerDetails(customer);
        return desired;

    }

    public Customer findById(long id)throws CustomerNotFoundException{
        Optional<Customer> optional= customerRepo.findById(id);
        if(!optional.isPresent()){
            throw new CustomerNotFoundException("customer not found for id="+id);
        }
        Customer customer=optional.get();
         return customer;
    }


    @Override
    public CustomerDetails buyProduct(BuyProductRequest request)
            throws CustomerNotFoundException {
        Customer customer=findById(request.getCustomerId());
       List<Long> products= customer.getProducts();
        if(products==null){
            products=new ArrayList<>();
            customer.setProducts(products);
        }
        products.add(request.getProductId());
        customer.setProducts(products);
        customerRepo.save(customer);
        CustomerDetails desired=customerUtil.toCustomerDetails(customer);
        return desired;

    }
}
