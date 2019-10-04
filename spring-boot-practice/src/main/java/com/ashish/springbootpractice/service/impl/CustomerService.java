package com.ashish.springbootpractice.service.impl;

import com.ashish.springbootpractice.model.Customer;
import com.ashish.springbootpractice.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CustomerService implements ICustomerService {

    private AtomicInteger customerId = new AtomicInteger(0);

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer(customerId.incrementAndGet(),"Ashish");
        Customer customer2 = new Customer(customerId.incrementAndGet(),"Sushant");
        customers.add(customer);
        customers.add(customer2);
        return customers;
    }

}
