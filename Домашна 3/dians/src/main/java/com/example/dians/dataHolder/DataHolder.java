package com.example.dians.dataHolder;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import lombok.Getter;
import com.example.dians.model.Restaurants;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Getter
public class DataHolder {
    public static List<Restaurants> restaurantsSkopje=new ArrayList<>();



    @PostConstruct
    public void init() throws IOException, CsvValidationException {

        CSVReader reader = new CSVReader(new FileReader("src/main/resources/RestoraniSkopje.csv"));
        reader.readNext();
        String[] tmp1;
        while ((tmp1 = reader.readNext()) != null){
            String[] elements1 = Arrays.toString(tmp1).split(",");
            Restaurants a=new Restaurants(elements1[0],elements1[1], elements1[2],elements1[3],elements1[4]);
            restaurantsSkopje.add(a);

        }



        }
    }

