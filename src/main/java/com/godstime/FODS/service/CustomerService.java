package com.godstime.FODS.service;

import com.godstime.FODS.model.Customer;

import java.util.List;

public interface CustomerService {

    public Customer customerRegistration(Customer customer);
    public Customer updateCustomerDetails(String uniqueId, Customer updatedCustomer);
    public Customer removeCustomer(String uniqueId, String userNameCustomer);
    public Customer showCustomerDetails(String uniqueId);
    public List<Customer> getAllCustomerDetails(String uniqueId);
}
