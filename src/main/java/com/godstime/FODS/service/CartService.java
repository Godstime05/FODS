package com.godstime.FODS.service;

import com.godstime.FODS.exception.CartNotFoundException;
import com.godstime.FODS.exception.CustomerLoginException;
import com.godstime.FODS.exception.ItemException;
import com.godstime.FODS.model.Cart;

public interface CartService {
    public Cart addItemToCart(Integer itemId, String uniqueId) throws CartNotFoundException, ItemException,
            CustomerLoginException;
    public Cart increaseQuantity(String uniqueId, Integer quantity, Integer itemId) throws CartNotFoundException, ItemException;
    public Cart decreaseQuantity(String uniqueId, Integer quantity, Integer itemId) throws CartNotFoundException, ItemException;
    public Cart removeItem(Integer cartId, Integer itemId) throws CartNotFoundException, ItemException;
    public Cart clearCart (Integer cartId) throws CartNotFoundException;
    public Cart viewCart (Integer cartId) throws CartNotFoundException;
}
