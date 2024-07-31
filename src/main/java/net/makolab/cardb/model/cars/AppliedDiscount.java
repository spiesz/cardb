
package net.makolab.cardb.model.cars;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AppliedValue",
    "Discount"
})
@Generated("jsonschema2pojo")
public class AppliedDiscount {

    @JsonProperty("AppliedValue")
    private Integer appliedValue;
    @JsonProperty("Discount")
    @Valid
    private Discount discount;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("AppliedValue")
    public Integer getAppliedValue() {
        return appliedValue;
    }

    @JsonProperty("AppliedValue")
    public void setAppliedValue(Integer appliedValue) {
        this.appliedValue = appliedValue;
    }

    @JsonProperty("Discount")
    public Discount getDiscount() {
        return discount;
    }

    @JsonProperty("Discount")
    public void setDiscount(Discount discount) {
        this.discount = discount;
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
