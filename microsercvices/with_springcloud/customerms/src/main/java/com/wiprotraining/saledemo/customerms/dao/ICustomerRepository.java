package com.wiprotraining.saledemo.customerms.dao;

import com.wiprotraining.saledemo.customerms.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface ICustomerRepository extends JpaRepository<Customer,Long> {
}
