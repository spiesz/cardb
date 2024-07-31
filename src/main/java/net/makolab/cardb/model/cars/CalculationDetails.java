
package net.makolab.cardb.model.cars;

import java.util.LinkedHashMap;
import java.util.List;
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
    "AdditionalInfo",
    "ExtraCosts"
})
@Generated("jsonschema2pojo")
public class CalculationDetails {

    @JsonProperty("AdditionalInfo")
    @Valid
    private List<AdditionalInfo> additionalInfo;
    @JsonProperty("ExtraCosts")
    @Valid
    private List<ExtraCost> extraCosts;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("AdditionalInfo")
    public List<AdditionalInfo> getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonProperty("AdditionalInfo")
    public void setAdditionalInfo(List<AdditionalInfo> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @JsonProperty("ExtraCosts")
    public List<ExtraCost> getExtraCosts() {
        return extraCosts;
    }

    @JsonProperty("ExtraCosts")
    public void setExtraCosts(List<ExtraCost> extraCosts) {
        this.extraCosts = extraCosts;
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
