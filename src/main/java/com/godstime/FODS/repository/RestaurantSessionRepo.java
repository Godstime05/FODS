package com.godstime.FODS.repository;

import com.godstime.FODS.DTO.CustomerSession;
import com.godstime.FODS.DTO.RestaurantSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantSessionRepo extends JpaRepository<RestaurantSession, Integer> {

    public CustomerSession findByUniqueId(String uniqueId);
}
