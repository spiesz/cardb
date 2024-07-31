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
import net.makolab.cardb.model.output.ModelCode;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class ModelsController {

    @GetMapping("/country/{country}/language/{language}/brand/{brand}/models")
    List<EntityModel<ModelCode>> getModels(@PathVariable("country") String country,
            @PathVariable("language") String language,
            @PathVariable("brand") String brand) {

        List<EntityModel<ModelCode>> modelCodes = new ArrayList<EntityModel<ModelCode>>();

        CardbService service = new CardbService();
        Models models = service.getModels(brand, country, language);

        for (Model model : models.getModels()) {
            ModelCode modelCode = new ModelCode();
            modelCode.setId(model.getInternalCode());
            modelCode.setName(model.getName());

            modelCodes.add(EntityModel.of(modelCode,
                    linkTo(methodOn(ModelsController.class).getModelById(country, language, brand,
                            model.getInternalCode())).withSelfRel(),
                    linkTo(methodOn(ModelsController.class).getModels(country, language, brand)).withRel("models"),
                    linkTo(methodOn(CarsController.class).getCars(country, language, brand,
                    model.getInternalCode())).withRel("cars")));
        }

        return modelCodes;
    }

    @GetMapping("/country/{country}/language/{language}/brand/{brand}/model/{id}")
    EntityModel<ModelCode> getModelById(@PathVariable("country") String country,
            @PathVariable("language") String language,
            @PathVariable("brand") String brand, @PathVariable("id") String id) {

        CardbService service = new CardbService();
        Models models = service.getModels(brand, country, language);

        for (Model model : models.getModels()) {

            if (id.equals(model.getInternalCode())) {
                ModelCode modelCode = new ModelCode();
                modelCode.setId(model.getInternalCode());
                modelCode.setName(model.getName());
                return EntityModel.of(modelCode,
                        linkTo(methodOn(ModelsController.class).getModelById(country, language, brand, id))
                                .withSelfRel(),
                        linkTo(methodOn(ModelsController.class).getModels(country, language, brand)).withRel("models"));
            }

        }

        return null;
    }

}
