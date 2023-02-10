package com.godstime.FODS.serviceImpl;

import com.godstime.FODS.model.Customer;
import com.godstime.FODS.repository.CustomerRepo;
import com.godstime.FODS.repository.CustomerSessionRepo;
import com.godstime.FODS.repository.RestaurantRepo;
import com.godstime.FODS.repository.RestaurantSessionRepo;
import com.godstime.FODS.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo cRepo;
    @Autowired
    private RestaurantRepo restaurantRepo;
    @Autowired
    private RestaurantSessionRepo rsRepo;
    @Autowired
    private CustomerSessionRepo csRepo;

    @Override
    public Customer customerRegistration(Customer customer) {
        return null;
    }

    @Override
    public Customer updateCustomerDetails(String uniqueId, Customer updatedCustomer) {
        return null;
    }

    @Override
    public Customer removeCustomer(String uniqueId, String userNameCustomer) {
        return null;
    }

    @Override
    public Customer showCustomerDetails(String uniqueId) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomerDetails(String uniqueId) {
        return null;
    }
}
