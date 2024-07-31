package net.makolab.cardb.model.configuration;

import java.util.LinkedHashMap;
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
        "Tax",
        "Delivery",
        "Plates",
        "Registration"
})

public class AdditionalInfo {

    @JsonProperty("Tax")
    private String tax;
    @JsonProperty("Delivery")
    private String delivery;
    @JsonProperty("Plates")
    private String plates;
    @JsonProperty("Registration")
    private String registration;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("Tax")
    public String getTax() {
        return tax;
    }

    @JsonProperty("Tax")
    public void setTax(String tax) {
        this.tax = tax;
    }

    @JsonProperty("Delivery")
    public String getDelivery() {
        return delivery;
    }

    @JsonProperty("Delivery")
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    @JsonProperty("Plates")
    public String getPlates() {
        return plates;
    }

    @JsonProperty("Plates")
    public void setPlates(String plates) {
        this.plates = plates;
    }

    @JsonProperty("Registration")
    public String getRegistration() {
        return registration;
    }

    @JsonProperty("Registration")
    public void setRegistration(String registration) {
        this.registration = registration;
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