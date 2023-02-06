package com.godstime.FODS.repository;

import com.godstime.FODS.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepo extends JpaRepository<Items, Integer> {
    public List<Items> findItemByName(String itemName);
}
