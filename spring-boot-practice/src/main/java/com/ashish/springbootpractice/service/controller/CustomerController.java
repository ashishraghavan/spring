package com.ashish.springbootpractice.service.controller;

import com.ashish.springbootpractice.model.Customer;
import com.ashish.springbootpractice.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    ICustomerService customerService;

    @RequestMapping(path = "/customers")
    @ResponseBody
    public List<Customer> getCustomers() {
        return customerService.getAll();
    }

}
