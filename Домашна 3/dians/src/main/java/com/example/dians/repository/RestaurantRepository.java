package com.example.dians.repository;

import com.example.dians.dataHolder.DataHolder;
import com.example.dians.model.Restaurants;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class RestaurantRepository {
    public List<Restaurants> findAllSkopje() {
        return DataHolder.restaurantsSkopje;
    }


    public Optional<Restaurants> findByIdSkopje(String id) {
        return DataHolder.restaurantsSkopje.stream().filter(i -> i.getId().equals(id)).findFirst();
    }


    public List<Restaurants> findByNameSkopje(String name) {
        return DataHolder.restaurantsSkopje.stream().filter(i -> i.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }



    public void deleteByIdSkopje(String id) {
        DataHolder.restaurantsSkopje.removeIf(i -> i.getId().equals(id));
    }



    public void deleteByNameSkopje(String name) {
        DataHolder.restaurantsSkopje.removeIf(i -> i.getName().equals(name));
    }


    public Optional<Restaurants> saveSkopje(String lat, String lon, String name) {
        DataHolder.restaurantsSkopje.removeIf(i -> i.getName().equals(name));
        Restaurants restaurant = new Restaurants(lat,lon,name);
        DataHolder.restaurantsSkopje.add(restaurant);
        return Optional.of(restaurant);
    }
}
