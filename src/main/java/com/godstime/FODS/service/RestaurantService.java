package com.godstime.FODS.service;

import com.godstime.FODS.exception.RestaurantException;
import com.godstime.FODS.model.Restaurants;

import java.util.List;

public interface RestaurantService {

    public Restaurants createRestaurant(Restaurants restaurants) throws RestaurantException;
    public Restaurants updateRestaurant(String uniqueId,Restaurants restaurants) throws RestaurantException;
    public Restaurants removeRestaurant(Integer restaurantId) throws RestaurantException;
    public List<Restaurants> viewRestaurant(String uniqueId) throws RestaurantException;
    public List<Restaurants> viewNearByRestaurant(String address) throws RestaurantException;
    public List<Restaurants> viewRestaurantByItemName(String itemName) throws RestaurantException;
    public Restaurants addRestaurant(Restaurants restaurants) throws RestaurantException;






}
