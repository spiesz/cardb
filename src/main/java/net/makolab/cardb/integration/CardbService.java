package net.makolab.cardb.integration;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.makolab.cardb.model.cars.Cars;
import net.makolab.cardb.model.models.Models;

@Service
public class CardbService {

    

    public Models getModels(String brand, String country, String language) {

        String uri = "https://cardb.toyota-europe.com/v3/" + "brand/" + brand + "/country/" + country + "/language/" + language + "/models";
        RestTemplate restTemplate = new RestTemplate();
        Models models = restTemplate.getForObject(uri, Models.class);
        return models;
    }


    public Cars getCars(String brand, String country, String language, String modelId) {

        String uri = "https://cardb.toyota-europe.com/v3/" + "brand/" + brand + "/country/" + country + "/language/" + language + "/model/" + modelId + "/cars";
        System.out.println("trying to get: " + uri);
        RestTemplate restTemplate = new RestTemplate();
        Cars cars = restTemplate.getForObject(uri, Cars.class);
        return cars;
    }


}
