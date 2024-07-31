package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.makolab.cardb.integration.CardbService;
import net.makolab.cardb.model.configuration.ConfigurationJson;
import net.makolab.cardb.model.models.Model;
import net.makolab.cardb.model.models.Models;
import net.makolab.cardb.model.cars.Car;
import net.makolab.cardb.model.cars.Cars;
import net.makolab.cardb.model.output.CarCode;
import net.makolab.cardb.model.output.ModelCode;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class CarsController {

    @GetMapping("/configuration")
    Models all() {
        ConfigurationJson json = new ConfigurationJson();
        json.setBrand("toyota");

        CardbService service = new CardbService();
        Models models = service.getModels("toyota", "es", "es");
        return models;
    }

    @GetMapping("/country/{country}/language/{language}/brand/{brand}/model/{modelId}/cars")
    List<EntityModel<CarCode>> getCars(@PathVariable("country") String country,
            @PathVariable("language") String language,
            @PathVariable("brand") String brand, @PathVariable("modelId") String modelId) {

        List<EntityModel<CarCode>> carCodes = new ArrayList<EntityModel<CarCode>>();

        CardbService service = new CardbService();
        Models models = service.getModels(brand, country, language);

        for (Model model : models.getModels()) {

            if (modelId.equals(model.getInternalCode())) {

                Cars cars = service.getCars(brand, country, language, modelId);

                for (Car car : cars.getCars()) {

                    CarCode carCode = new CarCode();
                    carCode.setId(car.getId());
                    carCode.setName(car.getName());

                    carCodes.add(EntityModel.of(carCode,
                            linkTo(methodOn(CarsController.class).getCarById(country, language, brand,
                                    modelId, car.getId())).withSelfRel(),
                            linkTo(methodOn(CarsController.class).getCars(country, language, brand,
                                    modelId)).withRel("cars")));
                }
            }

        }

        return carCodes;
    }

    @GetMapping("/country/{country}/language/{language}/brand/{brand}/model/{modelId}/car/{id}")
    EntityModel<CarCode> getCarById(@PathVariable("country") String country,
            @PathVariable("language") String language,
            @PathVariable("brand") String brand, @PathVariable("modelId") String modelId,
            @PathVariable("id") String id) {

        CardbService service = new CardbService();
        Models models = service.getModels(brand, country, language);

        for (Model model : models.getModels()) {

            if (modelId.equals(model.getInternalCode())) {

                Cars cars = service.getCars(brand, country, language, modelId);

                for (Car car : cars.getCars()) {

                    if (id.equals(car.getId())) {

                        CarCode carCode = new CarCode();
                        carCode.setId(car.getId());
                        carCode.setName(car.getName());

                        return EntityModel.of(carCode,
                                linkTo(methodOn(CarsController.class).getCarById(country, language, brand,
                                        modelId, car.getId())).withSelfRel(),
                                linkTo(methodOn(CarsController.class).getCars(country, language, brand,
                                        modelId)).withRel("cars"));
                    }
                }
            }

        }

        return null;
    }

}
