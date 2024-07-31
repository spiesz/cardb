
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
    "AvailableForOnlineReservation",
    "AvailableForOnlineSales",
    "BespokeBuild",
    "Body",
    "Engine",
    "Grade",
    "LineOffFrom",
    "LineOffTo",
    "Model",
    "Promoted",
    "SoldOut",
    "SubModel",
    "Transmission",
    "WheelDrive",
    "AvailablePromotions",
    "Context",
    "Currency",
    "LocalConfigurations",
    "Price",
    "ShortID",
    "Tokens",
    "VehicleType",
    "Visibility"
})
@Generated("jsonschema2pojo")
public class Car {

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
    @JsonProperty("AvailableForOnlineReservation")
    private Boolean availableForOnlineReservation;
    @JsonProperty("AvailableForOnlineSales")
    private Boolean availableForOnlineSales;
    @JsonProperty("BespokeBuild")
    private Boolean bespokeBuild;
    @JsonProperty("Body")
    @Valid
    private Body body;
    @JsonProperty("Engine")
    @Valid
    private Engine engine;
    @JsonProperty("Grade")
    @Valid
    private Grade grade;
    @JsonProperty("LineOffFrom")
    private String lineOffFrom;
    @JsonProperty("LineOffTo")
    private String lineOffTo;
    @JsonProperty("Model")
    @Valid
    private Model model;
    @JsonProperty("Promoted")
    private Boolean promoted;
    @JsonProperty("SoldOut")
    private Boolean soldOut;
    @JsonProperty("SubModel")
    private Object subModel;
    @JsonProperty("Transmission")
    @Valid
    private Transmission transmission;
    @JsonProperty("WheelDrive")
    @Valid
    private WheelDrive wheelDrive;
    @JsonProperty("AvailablePromotions")
    @Valid
    private List<AvailablePromotion> availablePromotions;
    @JsonProperty("Context")
    @Valid
    private Context context;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("LocalConfigurations")
    @Valid
    private List<LocalConfiguration> localConfigurations;
    @JsonProperty("Price")
    @Valid
    private Price price;
    @JsonProperty("ShortID")
    private Integer shortID;
    @JsonProperty("Tokens")
    @Valid
    private Tokens tokens;
    @JsonProperty("VehicleType")
    private Integer vehicleType;
    @JsonProperty("Visibility")
    private Integer visibility;
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

    @JsonProperty("AvailableForOnlineReservation")
    public Boolean getAvailableForOnlineReservation() {
        return availableForOnlineReservation;
    }

    @JsonProperty("AvailableForOnlineReservation")
    public void setAvailableForOnlineReservation(Boolean availableForOnlineReservation) {
        this.availableForOnlineReservation = availableForOnlineReservation;
    }

    @JsonProperty("AvailableForOnlineSales")
    public Boolean getAvailableForOnlineSales() {
        return availableForOnlineSales;
    }

    @JsonProperty("AvailableForOnlineSales")
    public void setAvailableForOnlineSales(Boolean availableForOnlineSales) {
        this.availableForOnlineSales = availableForOnlineSales;
    }

    @JsonProperty("BespokeBuild")
    public Boolean getBespokeBuild() {
        return bespokeBuild;
    }

    @JsonProperty("BespokeBuild")
    public void setBespokeBuild(Boolean bespokeBuild) {
        this.bespokeBuild = bespokeBuild;
    }

    @JsonProperty("Body")
    public Body getBody() {
        return body;
    }

    @JsonProperty("Body")
    public void setBody(Body body) {
        this.body = body;
    }

    @JsonProperty("Engine")
    public Engine getEngine() {
        return engine;
    }

    @JsonProperty("Engine")
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @JsonProperty("Grade")
    public Grade getGrade() {
        return grade;
    }

    @JsonProperty("Grade")
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @JsonProperty("LineOffFrom")
    public String getLineOffFrom() {
        return lineOffFrom;
    }

    @JsonProperty("LineOffFrom")
    public void setLineOffFrom(String lineOffFrom) {
        this.lineOffFrom = lineOffFrom;
    }

    @JsonProperty("LineOffTo")
    public String getLineOffTo() {
        return lineOffTo;
    }

    @JsonProperty("LineOffTo")
    public void setLineOffTo(String lineOffTo) {
        this.lineOffTo = lineOffTo;
    }

    @JsonProperty("Model")
    public Model getModel() {
        return model;
    }

    @JsonProperty("Model")
    public void setModel(Model model) {
        this.model = model;
    }

    @JsonProperty("Promoted")
    public Boolean getPromoted() {
        return promoted;
    }

    @JsonProperty("Promoted")
    public void setPromoted(Boolean promoted) {
        this.promoted = promoted;
    }

    @JsonProperty("SoldOut")
    public Boolean getSoldOut() {
        return soldOut;
    }

    @JsonProperty("SoldOut")
    public void setSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
    }

    @JsonProperty("SubModel")
    public Object getSubModel() {
        return subModel;
    }

    @JsonProperty("SubModel")
    public void setSubModel(Object subModel) {
        this.subModel = subModel;
    }

    @JsonProperty("Transmission")
    public Transmission getTransmission() {
        return transmission;
    }

    @JsonProperty("Transmission")
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @JsonProperty("WheelDrive")
    public WheelDrive getWheelDrive() {
        return wheelDrive;
    }

    @JsonProperty("WheelDrive")
    public void setWheelDrive(WheelDrive wheelDrive) {
        this.wheelDrive = wheelDrive;
    }

    @JsonProperty("AvailablePromotions")
    public List<AvailablePromotion> getAvailablePromotions() {
        return availablePromotions;
    }

    @JsonProperty("AvailablePromotions")
    public void setAvailablePromotions(List<AvailablePromotion> availablePromotions) {
        this.availablePromotions = availablePromotions;
    }

    @JsonProperty("Context")
    public Context getContext() {
        return context;
    }

    @JsonProperty("Context")
    public void setContext(Context context) {
        this.context = context;
    }

    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("LocalConfigurations")
    public List<LocalConfiguration> getLocalConfigurations() {
        return localConfigurations;
    }

    @JsonProperty("LocalConfigurations")
    public void setLocalConfigurations(List<LocalConfiguration> localConfigurations) {
        this.localConfigurations = localConfigurations;
    }

    @JsonProperty("Price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("Price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("ShortID")
    public Integer getShortID() {
        return shortID;
    }

    @JsonProperty("ShortID")
    public void setShortID(Integer shortID) {
        this.shortID = shortID;
    }

    @JsonProperty("Tokens")
    public Tokens getTokens() {
        return tokens;
    }

    @JsonProperty("Tokens")
    public void setTokens(Tokens tokens) {
        this.tokens = tokens;
    }

    @JsonProperty("VehicleType")
    public Integer getVehicleType() {
        return vehicleType;
    }

    @JsonProperty("VehicleType")
    public void setVehicleType(Integer vehicleType) {
        this.vehicleType = vehicleType;
    }

    @JsonProperty("Visibility")
    public Integer getVisibility() {
        return visibility;
    }

    @JsonProperty("Visibility")
    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
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
