package com.godstime.FODS.repository;

import com.godstime.FODS.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {
    public Cart findByCustumerId(Integer customerId);

}
