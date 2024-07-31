
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
    "Base",
    "Code",
    "Description",
    "FromDate",
    "ID",
    "LocalModelID",
    "NmscCode",
    "TmcModelYear",
    "ToDate",
    "Version"
})
@Generated("jsonschema2pojo")
public class LocalConfiguration {

    @JsonProperty("Base")
    private Boolean base;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("FromDate")
    private String fromDate;
    @JsonProperty("ID")
    private String id;
    @JsonProperty("LocalModelID")
    private String localModelID;
    @JsonProperty("NmscCode")
    private String nmscCode;
    @JsonProperty("TmcModelYear")
    private String tmcModelYear;
    @JsonProperty("ToDate")
    private String toDate;
    @JsonProperty("Version")
    private Integer version;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("Base")
    public Boolean getBase() {
        return base;
    }

    @JsonProperty("Base")
    public void setBase(Boolean base) {
        this.base = base;
    }

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("FromDate")
    public String getFromDate() {
        return fromDate;
    }

    @JsonProperty("FromDate")
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("LocalModelID")
    public String getLocalModelID() {
        return localModelID;
    }

    @JsonProperty("LocalModelID")
    public void setLocalModelID(String localModelID) {
        this.localModelID = localModelID;
    }

    @JsonProperty("NmscCode")
    public String getNmscCode() {
        return nmscCode;
    }

    @JsonProperty("NmscCode")
    public void setNmscCode(String nmscCode) {
        this.nmscCode = nmscCode;
    }

    @JsonProperty("TmcModelYear")
    public String getTmcModelYear() {
        return tmcModelYear;
    }

    @JsonProperty("TmcModelYear")
    public void setTmcModelYear(String tmcModelYear) {
        this.tmcModelYear = tmcModelYear;
    }

    @JsonProperty("ToDate")
    public String getToDate() {
        return toDate;
    }

    @JsonProperty("ToDate")
    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    @JsonProperty("Version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("Version")
    public void setVersion(Integer version) {
        this.version = version;
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
