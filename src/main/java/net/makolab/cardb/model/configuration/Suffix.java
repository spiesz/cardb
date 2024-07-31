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
        "Code",
        "Katashiki",
        "AvailableFromDate",
        "AvailableToDate"
})

public class Suffix {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("Katashiki")
    private String katashiki;
    @JsonProperty("AvailableFromDate")
    private String availableFromDate;
    @JsonProperty("AvailableToDate")
    private String availableToDate;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("Katashiki")
    public String getKatashiki() {
        return katashiki;
    }

    @JsonProperty("Katashiki")
    public void setKatashiki(String katashiki) {
        this.katashiki = katashiki;
    }

    @JsonProperty("AvailableFromDate")
    public String getAvailableFromDate() {
        return availableFromDate;
    }

    @JsonProperty("AvailableFromDate")
    public void setAvailableFromDate(String availableFromDate) {
        this.availableFromDate = availableFromDate;
    }

    @JsonProperty("AvailableToDate")
    public String getAvailableToDate() {
        return availableToDate;
    }

    @JsonProperty("AvailableToDate")
    public void setAvailableToDate(String availableToDate) {
        this.availableToDate = availableToDate;
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