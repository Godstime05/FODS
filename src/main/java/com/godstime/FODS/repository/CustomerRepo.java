package com.godstime.FODS.repository;

import com.godstime.FODS.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    public Customer findByMobileNumber(String mobileNumber);

}
