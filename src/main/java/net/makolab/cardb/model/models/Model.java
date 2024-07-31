
package net.makolab.cardb.model.models;

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
    "ID",
    "InternalCode",
    "InternalName",
    "LocalCode",
    "Name",
    "Description",
    "FootNote",
    "Labels",
    "SortIndex",
    "ToolTip",
    "AvailablePromotions",
    "ConnectedCar",
    "Context",
    "ModifiedOn",
    "Tokens"
})
@Generated("jsonschema2pojo")
public class Model {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("InternalCode")
    private String internalCode;
    @JsonProperty("InternalName")
    private String internalName;
    @JsonProperty("LocalCode")
    private String localCode;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("FootNote")
    private String footNote;
    @JsonProperty("Labels")
    @Valid
    private List<Object> labels;
    @JsonProperty("SortIndex")
    private Integer sortIndex;
    @JsonProperty("ToolTip")
    private String toolTip;
    @JsonProperty("AvailablePromotions")
    @Valid
    private List<AvailablePromotion> availablePromotions;
    @JsonProperty("ConnectedCar")
    private Boolean connectedCar;
    @JsonProperty("Context")
    @Valid
    private Context context;
    @JsonProperty("ModifiedOn")
    private String modifiedOn;
    @JsonProperty("Tokens")
    @Valid
    private Tokens tokens;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("InternalCode")
    public String getInternalCode() {
        return internalCode;
    }

    @JsonProperty("InternalCode")
    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

    @JsonProperty("InternalName")
    public String getInternalName() {
        return internalName;
    }

    @JsonProperty("InternalName")
    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    @JsonProperty("LocalCode")
    public String getLocalCode() {
        return localCode;
    }

    @JsonProperty("LocalCode")
    public void setLocalCode(String localCode) {
        this.localCode = localCode;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("FootNote")
    public String getFootNote() {
        return footNote;
    }

    @JsonProperty("FootNote")
    public void setFootNote(String footNote) {
        this.footNote = footNote;
    }

    @JsonProperty("Labels")
    public List<Object> getLabels() {
        return labels;
    }

    @JsonProperty("Labels")
    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    @JsonProperty("SortIndex")
    public Integer getSortIndex() {
        return sortIndex;
    }

    @JsonProperty("SortIndex")
    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }

    @JsonProperty("ToolTip")
    public String getToolTip() {
        return toolTip;
    }

    @JsonProperty("ToolTip")
    public void setToolTip(String toolTip) {
        this.toolTip = toolTip;
    }

    @JsonProperty("AvailablePromotions")
    public List<AvailablePromotion> getAvailablePromotions() {
        return availablePromotions;
    }

    @JsonProperty("AvailablePromotions")
    public void setAvailablePromotions(List<AvailablePromotion> availablePromotions) {
        this.availablePromotions = availablePromotions;
    }

    @JsonProperty("ConnectedCar")
    public Boolean getConnectedCar() {
        return connectedCar;
    }

    @JsonProperty("ConnectedCar")
    public void setConnectedCar(Boolean connectedCar) {
        this.connectedCar = connectedCar;
    }

    @JsonProperty("Context")
    public Context getContext() {
        return context;
    }

    @JsonProperty("Context")
    public void setContext(Context context) {
        this.context = context;
    }

    @JsonProperty("ModifiedOn")
    public String getModifiedOn() {
        return modifiedOn;
    }

    @JsonProperty("ModifiedOn")
    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    @JsonProperty("Tokens")
    public Tokens getTokens() {
        return tokens;
    }

    @JsonProperty("Tokens")
    public void setTokens(Tokens tokens) {
        this.tokens = tokens;
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
