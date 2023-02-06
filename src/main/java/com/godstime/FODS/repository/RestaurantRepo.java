package com.godstime.FODS.repository;

import com.godstime.FODS.model.Restaurants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurants, Integer> {
    public Restaurants findByPhoneNumber(String phoneNumber);

    @Query("select s from Restaurants s")
    public List<Restaurants> getRestaurantByLocation();


    public Restaurants findByRestaurantName(String restaurantName);

    @Query("select s from Restaurants s where s.restaurantName=?1")
    public Restaurants getByName(String restaurantName);
}
