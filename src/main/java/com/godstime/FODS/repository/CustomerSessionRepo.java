package com.godstime.FODS.repository;

import com.godstime.FODS.DTO.CustomerSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerSessionRepo extends JpaRepository<CustomerSession, Integer> {
    public CustomerSession findByUniqueId(String uniqueId);
}
