package com.godstime.FODS.service;

import com.godstime.FODS.exception.ItemException;
import com.godstime.FODS.exception.RestaurantException;
import com.godstime.FODS.model.Items;

import java.util.List;

public interface ItemService {
    public Items createItem(String restaurantName, Items item) throws ItemException;
    public Items updateItem(String restaurantName, Items item) throws  ItemException;
    public Items viewItem(String restaurantName, Integer itemId) throws  ItemException;
    public Items removeItem(Integer restaurantId, String uniqueId, Items item) throws  ItemException, RestaurantException;
    public List<Items> viewAllItemsOfRestaurant(Integer restaurantId, String uniqueId) throws ItemException;
    public List<Items> viewAllItemsByName(String name) throws ItemException;

    public Items addItemToRestaurant(String restaurantName, Items item) throws ItemException;

}
