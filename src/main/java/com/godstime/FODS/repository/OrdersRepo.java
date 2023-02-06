package com.godstime.FODS.repository;

import com.godstime.FODS.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepo extends JpaRepository<OrderDetails, Integer> {
}
