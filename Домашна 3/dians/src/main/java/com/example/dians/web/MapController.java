package com.example.dians.web;


import com.example.dians.model.Restaurants;
import com.example.dians.service.RestaurantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class MapController {

    final RestaurantService restaurantService;

    public MapController( RestaurantService restaurantService) {
        this.restaurantService = restaurantService;

    }

    @GetMapping("/MapSkopje")
    public String getMapSkopje(Model model) {
        List<Restaurants> restaurantsSkopje = this.restaurantService.findAllSkopje();
        model.addAttribute("restaurantsSkopje", restaurantsSkopje);
        model.addAttribute("bodyContent", "MapSkopje.html");
        return "template";
    }


}