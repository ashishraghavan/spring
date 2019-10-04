package com.ashish.springbootpractice.service;

import com.ashish.springbootpractice.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
}
