package com.example.dians.web;
import com.example.dians.model.Restaurants;
import com.example.dians.service.RestaurantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RestaurantController {

   final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }


    @GetMapping("/RestaurantsSkopje")
    public String getAttractionsSkopje(Model model){
        List<Restaurants> attractionsSkopje=this.restaurantService.findAllSkopje();
        model.addAttribute("restaurantsSkopje", attractionsSkopje);
        model.addAttribute("bodyContent", "RestaurantsSkopje");
        return "template";
    }



    @PostMapping("/RestaurantsSkopje")
    public String attractionsSearchSkopje(Model model,@RequestParam(value = "searchSkopje",required = false) String searchSkopje){
        List<Restaurants> foundSkopje= this.restaurantService.findByName(searchSkopje);
        model.addAttribute("foundSkopje", this.restaurantService.findByName(searchSkopje));
        model.addAttribute("bodyContent", "RestaurantsSkopje");
        return "template";
    }



}
