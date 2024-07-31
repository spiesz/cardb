
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
    "Entity",
    "OnlineCash",
    "OnlineMonthlyRate",
    "ValidFrom",
    "ValidUntil"
})
@Generated("jsonschema2pojo")
public class AvailablePromotion {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("InternalCode")
    private Object internalCode;
    @JsonProperty("InternalName")
    private String internalName;
    @JsonProperty("LocalCode")
    private Object localCode;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("FootNote")
    private String footNote;
    @JsonProperty("Labels")
    @Valid
    private List<Label> labels;
    @JsonProperty("SortIndex")
    private Integer sortIndex;
    @JsonProperty("ToolTip")
    private String toolTip;
    @JsonProperty("Entity")
    private String entity;
    @JsonProperty("OnlineCash")
    private Boolean onlineCash;
    @JsonProperty("OnlineMonthlyRate")
    private Boolean onlineMonthlyRate;
    @JsonProperty("ValidFrom")
    private String validFrom;
    @JsonProperty("ValidUntil")
    private String validUntil;
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
    public Object getInternalCode() {
        return internalCode;
    }

    @JsonProperty("InternalCode")
    public void setInternalCode(Object internalCode) {
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
    public Object getLocalCode() {
        return localCode;
    }

    @JsonProperty("LocalCode")
    public void setLocalCode(Object localCode) {
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
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("Labels")
    public void setLabels(List<Label> labels) {
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

    @JsonProperty("Entity")
    public String getEntity() {
        return entity;
    }

    @JsonProperty("Entity")
    public void setEntity(String entity) {
        this.entity = entity;
    }

    @JsonProperty("OnlineCash")
    public Boolean getOnlineCash() {
        return onlineCash;
    }

    @JsonProperty("OnlineCash")
    public void setOnlineCash(Boolean onlineCash) {
        this.onlineCash = onlineCash;
    }

    @JsonProperty("OnlineMonthlyRate")
    public Boolean getOnlineMonthlyRate() {
        return onlineMonthlyRate;
    }

    @JsonProperty("OnlineMonthlyRate")
    public void setOnlineMonthlyRate(Boolean onlineMonthlyRate) {
        this.onlineMonthlyRate = onlineMonthlyRate;
    }

    @JsonProperty("ValidFrom")
    public String getValidFrom() {
        return validFrom;
    }

    @JsonProperty("ValidFrom")
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    @JsonProperty("ValidUntil")
    public String getValidUntil() {
        return validUntil;
    }

    @JsonProperty("ValidUntil")
    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
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
