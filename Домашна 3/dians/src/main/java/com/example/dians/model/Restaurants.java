package com.example.dians.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Restaurants {
    String id;
    String lat;
    String lon;
    String name;
    String cuisine;

    public Restaurants( String lat, String lon, String name) {
        this.lat = lat;
        this.lon = lon;
        this.name = name;
    }
}
