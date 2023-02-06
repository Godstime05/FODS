package com.godstime.FODS.repository;

import com.godstime.FODS.model.Bills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillsRepo extends JpaRepository<Bills, Integer> {
}
