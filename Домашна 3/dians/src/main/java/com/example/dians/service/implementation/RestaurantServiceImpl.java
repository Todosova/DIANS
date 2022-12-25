package com.example.dians.service.implementation;


import com.example.dians.repository.RestaurantRepository;
import com.example.dians.service.RestaurantService;
import com.example.dians.model.Restaurants;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    final RestaurantRepository repository;

    public RestaurantServiceImpl(RestaurantRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Restaurants> findAllSkopje() {
        return repository.findAllSkopje();
    }

    @Override
    public List<Restaurants> findByName(String name) {
        return repository.findByNameSkopje(name);
    }

    @Override
    public Optional<Restaurants> findById(String id) {
        return repository.findByIdSkopje(id);
    }

    @Override
    public Optional<Restaurants> saveSkopje(String lat, String lon, String name) {
        return repository.saveSkopje(lat,lon,name);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteByIdSkopje(id);

    }
}
