package com.godstime.FODS.service;

import com.godstime.FODS.exception.OrderException;
import com.godstime.FODS.model.Customer;
import com.godstime.FODS.model.OrderDetails;
import com.godstime.FODS.model.Restaurants;

import java.util.List;

public interface OrderService {

    public OrderDetails addOrder(Integer cartId, String uniqueId) throws OrderException;
    public OrderDetails removeOrder(OrderDetails order) throws OrderException;
    public OrderDetails updateOrder(OrderDetails order) throws OrderException;
    public OrderDetails viewOrder(OrderDetails order) throws OrderException;

    public List<OrderDetails> viewAllOrders(Restaurants restaurants) throws OrderException;
    public List<OrderDetails> viewAllOrders(Customer customer) throws OrderException;
}
