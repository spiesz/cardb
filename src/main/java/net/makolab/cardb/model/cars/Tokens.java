
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
    "ProductTimeFrame",
    "PromotionTimeFrame",
    "PublicationID"
})
@Generated("jsonschema2pojo")
public class Tokens {

    @JsonProperty("ProductTimeFrame")
    private String productTimeFrame;
    @JsonProperty("PromotionTimeFrame")
    private String promotionTimeFrame;
    @JsonProperty("PublicationID")
    private String publicationID;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ProductTimeFrame")
    public String getProductTimeFrame() {
        return productTimeFrame;
    }

    @JsonProperty("ProductTimeFrame")
    public void setProductTimeFrame(String productTimeFrame) {
        this.productTimeFrame = productTimeFrame;
    }

    @JsonProperty("PromotionTimeFrame")
    public String getPromotionTimeFrame() {
        return promotionTimeFrame;
    }

    @JsonProperty("PromotionTimeFrame")
    public void setPromotionTimeFrame(String promotionTimeFrame) {
        this.promotionTimeFrame = promotionTimeFrame;
    }

    @JsonProperty("PublicationID")
    public String getPublicationID() {
        return publicationID;
    }

    @JsonProperty("PublicationID")
    public void setPublicationID(String publicationID) {
        this.publicationID = publicationID;
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
