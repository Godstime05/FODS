package com.godstime.FODS.repository;

import com.godstime.FODS.model.Bills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BillsRepo extends JpaRepository<Bills, Integer> {
    List<Bills> findByDateBetween(LocalDate startDate, LocalDate endDate);

}
