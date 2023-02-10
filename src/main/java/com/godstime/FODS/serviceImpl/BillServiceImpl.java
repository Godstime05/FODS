package com.godstime.FODS.serviceImpl;

import com.godstime.FODS.DTO.CustomerSession;
import com.godstime.FODS.exception.BillsException;
import com.godstime.FODS.model.Bills;
import com.godstime.FODS.model.Customer;
import com.godstime.FODS.model.Items;
import com.godstime.FODS.model.OrderDetails;
import com.godstime.FODS.repository.BillsRepo;
import com.godstime.FODS.repository.CustomerRepo;
import com.godstime.FODS.repository.CustomerSessionRepo;
import com.godstime.FODS.repository.OrdersRepo;
import com.godstime.FODS.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class BillServiceImpl implements BillService {

    @Autowired
    private BillsRepo billsRepo;

    @Autowired
    public OrdersRepo ordersRepo;

    @Autowired
    public CustomerSessionRepo csRepos;

    @Autowired
    public CustomerRepo customerRepo;

    @Override
    public Bills addBill(Integer orderId, String uniqueId) throws BillsException {
        CustomerSession customerSession = csRepos.findByUniqueId(uniqueId);
        if (customerSession != null){
            Optional<OrderDetails> orderOption = ordersRepo.findById(orderId);
            Optional<Customer> customerOption = customerRepo.findById(customerSession.getCustomerId());

            if (orderOption.isPresent() && customerOption.isPresent()){
                OrderDetails orderDetails = orderOption.get();
                Customer customerDetails = customerOption.get();
                Bills bills = new Bills();
                bills.setBillDate(orderDetails.getOrderDate());
                bills.setCustAddress(customerDetails.getAddress());
                bills.setCustomerName(customerDetails.getFirstName() + " " + customerDetails.getLastName());

                List<Items> itemsList=orderDetails.getCart().getItemsList();
                double totalCost = 0;
                Integer totalItems = 0;
                for (Items i : itemsList){
                    totalCost += i.getQuantity()*i.getUnitCost();
                    totalItems += i.getQuantity();
                }
                bills.setTotalCost(totalCost);
                bills.setTotalItems(totalItems);
                billsRepo.save(bills);
                return bills;
            }
            else {
                throw new BillsException("Wrong Order Id, please pass correct Order Id");
            }

            }else {
            throw new BillsException("Customer is not logged in");
        }
       // return null;
    }

    @Override
    public Bills removeBill(Bills bill) throws BillsException {
        Optional<Bills> billsOptions = billsRepo.findById(bill.getBillId());

        if (billsOptions.isPresent()){
            billsRepo.delete(bill);
        }
        else {
            throw new BillsException("No Bills found by "+ bill.getBillId() + " id");
        }
        return bill;    }

    @Override
    public Bills updateBill(Bills bill) throws BillsException {
        Optional<Bills> billsOption = billsRepo.findById(bill.getBillId());
        Bills billUpdate = null;
        if (billsOption.isPresent()) {
            billUpdate = billsRepo.save(billsOption.get());

        } else {
            throw new BillsException("No bill found by " + bill.getBillId() + " id");
        }

        return billUpdate;
    }

    @Override
    public Bills viewBill(Bills bill) throws BillsException {
        Optional<Bills> billOption = billsRepo.findById(bill.getBillId());
        Bills existingBill = null;
        if (billOption.isPresent()) {

            existingBill = billOption.get();

        } else {
            throw new BillsException("No bill found by " + bill.getBillId() + " id");
        }

        return existingBill;    }

    @Override
    public List<Bills> viewBills(Integer customerId) throws BillsException {
        return null;
    }

//    @Override
//    public List<Bills> viewBills(LocalDate startDate, LocalDate endDate) throws BillsException {
//        return null;
//    }

    @Override
    public List<Bills> viewBills(LocalDate startDate, LocalDate endDate) throws BillsException {
        try {
            // Validate input
            if (startDate == null) {
                throw new BillsException("Start date cannot be null.");
            }
            if (endDate == null) {
                throw new BillsException("End date cannot be null.");
            }
            if (endDate.isBefore(startDate)) {
                throw new BillsException("End date cannot be before start date.");
            }

            return billsRepo.findByDateBetween(startDate, endDate);
        } catch (Exception ex) {
            throw new BillsException("Error viewing bills: " + ex.getMessage());
        }
    }


//    @Override
//    public double calculateTotalCost(Bills bill) throws BillsException {
//        return 0;
//    }

    @Override
    public double calculateTotalCost(Bills bill) throws BillsException {
        try {
            // Validate input
            if (bill == null) {
                throw new BillsException("Bill cannot be null.");
            }

            double totalCost = 0;
           OrderDetails orderDetails = bill.getOrderDetails();
            for (OrderDetails orderDetail : orderDetail) {
                totalCost += orderDetail.getQuantity() * orderDetail.getItems().getUnitCost();
            }
            return totalCost;
        } catch (Exception ex) {
            throw new BillsException("Error calculating total cost: " + ex.getMessage());
        }
    }

}
