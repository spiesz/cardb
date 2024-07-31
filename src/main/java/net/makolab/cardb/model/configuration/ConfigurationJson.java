package net.makolab.cardb.model.configuration;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Language",
        "Country",
        "Brand",
        "ModelID",
        "CarID",
        "ExteriorColourID",
        "UpholsteryID",
        "TotalPrice",
        "Options",
        "Packs",
        "PSLS",
        "Parameters"
})

public class ConfigurationJson {

    @JsonProperty("Language")
    private String language;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("Brand")
    private String brand;
    @JsonProperty("ModelID")
    private String modelID;
    @JsonProperty("CarID")
    private String carID;
    @JsonProperty("ExteriorColourID")
    private String exteriorColourID;
    @JsonProperty("UpholsteryID")
    private String upholsteryID;
    @JsonProperty("TotalPrice")
    private Integer totalPrice;
    @JsonProperty("Options")
    @Valid
    private List<String> options;
    @JsonProperty("Packs")
    @Valid
    private List<String> packs;
    @JsonProperty("PSLS")
    @Valid
    private Psls psls;
    @JsonProperty("Parameters")
    @Valid
    private Parameters parameters;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("Language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("Language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("Brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("Brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("ModelID")
    public String getModelID() {
        return modelID;
    }

    @JsonProperty("ModelID")
    public void setModelID(String modelID) {
        this.modelID = modelID;
    }

    @JsonProperty("CarID")
    public String getCarID() {
        return carID;
    }

    @JsonProperty("CarID")
    public void setCarID(String carID) {
        this.carID = carID;
    }

    @JsonProperty("ExteriorColourID")
    public String getExteriorColourID() {
        return exteriorColourID;
    }

    @JsonProperty("ExteriorColourID")
    public void setExteriorColourID(String exteriorColourID) {
        this.exteriorColourID = exteriorColourID;
    }

    @JsonProperty("UpholsteryID")
    public String getUpholsteryID() {
        return upholsteryID;
    }

    @JsonProperty("UpholsteryID")
    public void setUpholsteryID(String upholsteryID) {
        this.upholsteryID = upholsteryID;
    }

    @JsonProperty("TotalPrice")
    public Integer getTotalPrice() {
        return totalPrice;
    }

    @JsonProperty("TotalPrice")
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    @JsonProperty("Options")
    public List<String> getOptions() {
        return options;
    }

    @JsonProperty("Options")
    public void setOptions(List<String> options) {
        this.options = options;
    }

    @JsonProperty("Packs")
    public List<String> getPacks() {
        return packs;
    }

    @JsonProperty("Packs")
    public void setPacks(List<String> packs) {
        this.packs = packs;
    }

    @JsonProperty("PSLS")
    public Psls getPsls() {
        return psls;
    }

    @JsonProperty("PSLS")
    public void setPsls(Psls psls) {
        this.psls = psls;
    }

    @JsonProperty("Parameters")
    public Parameters getParameters() {
        return parameters;
    }

    @JsonProperty("Parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}