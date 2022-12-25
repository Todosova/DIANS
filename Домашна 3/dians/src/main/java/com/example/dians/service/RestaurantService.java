package com.example.dians.service;

import com.example.dians.model.Restaurants;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {

    List<Restaurants> findAllSkopje();
    List<Restaurants> findByName(String name);
    Optional<Restaurants> findById(String id);
    Optional<Restaurants> saveSkopje(String lat,String lon,String name);
    void deleteById(String id);
 }
