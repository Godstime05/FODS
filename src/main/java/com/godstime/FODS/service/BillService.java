package com.godstime.FODS.service;

import com.godstime.FODS.exception.BillsException;
import com.godstime.FODS.model.Bills;

import java.time.LocalDate;
import java.util.List;

public interface BillService {
    public Bills addBill(Integer orderId, String uniqueId) throws BillsException;
    public Bills removeBill(Bills bill) throws BillsException;
    public Bills updateBill(Bills bill) throws  BillsException;
    public Bills viewBill(Bills bill) throws BillsException;

    public List<Bills> viewBills(Integer customerId) throws BillsException;
    public List<Bills> viewBills(LocalDate startDate, LocalDate endDate) throws BillsException;

    double calculateTotalCost(Bills bill) throws BillsException;

}
