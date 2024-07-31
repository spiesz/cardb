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
        "Suffix",
        "ColourCode",
        "UpholsteryCode"
})

public class Psls {

    @JsonProperty("Suffix")
    @Valid
    private Suffix suffix;
    @JsonProperty("ColourCode")
    private String colourCode;
    @JsonProperty("UpholsteryCode")
    private String upholsteryCode;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("Suffix")
    public Suffix getSuffix() {
        return suffix;
    }

    @JsonProperty("Suffix")
    public void setSuffix(Suffix suffix) {
        this.suffix = suffix;
    }

    @JsonProperty("ColourCode")
    public String getColourCode() {
        return colourCode;
    }

    @JsonProperty("ColourCode")
    public void setColourCode(String colourCode) {
        this.colourCode = colourCode;
    }

    @JsonProperty("UpholsteryCode")
    public String getUpholsteryCode() {
        return upholsteryCode;
    }

    @JsonProperty("UpholsteryCode")
    public void setUpholsteryCode(String upholsteryCode) {
        this.upholsteryCode = upholsteryCode;
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