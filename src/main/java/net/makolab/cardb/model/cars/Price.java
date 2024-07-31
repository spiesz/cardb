
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
    "AppliedDiscounts",
    "AppliedSpotLights",
    "ListPrice",
    "ListPriceDiscount",
    "ListPriceWithDiscount",
    "NetPrice",
    "NetPriceDiscount",
    "NetPriceWithDiscount",
    "Tax",
    "TaxDiscount",
    "TaxWithDiscount",
    "CalculationDetails"
})
@Generated("jsonschema2pojo")
public class Price {

    @JsonProperty("AppliedDiscounts")
    @Valid
    private List<AppliedDiscount> appliedDiscounts;
    @JsonProperty("AppliedSpotLights")
    @Valid
    private List<Object> appliedSpotLights;
    @JsonProperty("ListPrice")
    private Integer listPrice;
    @JsonProperty("ListPriceDiscount")
    private Integer listPriceDiscount;
    @JsonProperty("ListPriceWithDiscount")
    private Integer listPriceWithDiscount;
    @JsonProperty("NetPrice")
    private Double netPrice;
    @JsonProperty("NetPriceDiscount")
    private Integer netPriceDiscount;
    @JsonProperty("NetPriceWithDiscount")
    private Double netPriceWithDiscount;
    @JsonProperty("Tax")
    private Double tax;
    @JsonProperty("TaxDiscount")
    private Integer taxDiscount;
    @JsonProperty("TaxWithDiscount")
    private Double taxWithDiscount;
    @JsonProperty("CalculationDetails")
    @Valid
    private CalculationDetails calculationDetails;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("AppliedDiscounts")
    public List<AppliedDiscount> getAppliedDiscounts() {
        return appliedDiscounts;
    }

    @JsonProperty("AppliedDiscounts")
    public void setAppliedDiscounts(List<AppliedDiscount> appliedDiscounts) {
        this.appliedDiscounts = appliedDiscounts;
    }

    @JsonProperty("AppliedSpotLights")
    public List<Object> getAppliedSpotLights() {
        return appliedSpotLights;
    }

    @JsonProperty("AppliedSpotLights")
    public void setAppliedSpotLights(List<Object> appliedSpotLights) {
        this.appliedSpotLights = appliedSpotLights;
    }

    @JsonProperty("ListPrice")
    public Integer getListPrice() {
        return listPrice;
    }

    @JsonProperty("ListPrice")
    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }

    @JsonProperty("ListPriceDiscount")
    public Integer getListPriceDiscount() {
        return listPriceDiscount;
    }

    @JsonProperty("ListPriceDiscount")
    public void setListPriceDiscount(Integer listPriceDiscount) {
        this.listPriceDiscount = listPriceDiscount;
    }

    @JsonProperty("ListPriceWithDiscount")
    public Integer getListPriceWithDiscount() {
        return listPriceWithDiscount;
    }

    @JsonProperty("ListPriceWithDiscount")
    public void setListPriceWithDiscount(Integer listPriceWithDiscount) {
        this.listPriceWithDiscount = listPriceWithDiscount;
    }

    @JsonProperty("NetPrice")
    public Double getNetPrice() {
        return netPrice;
    }

    @JsonProperty("NetPrice")
    public void setNetPrice(Double netPrice) {
        this.netPrice = netPrice;
    }

    @JsonProperty("NetPriceDiscount")
    public Integer getNetPriceDiscount() {
        return netPriceDiscount;
    }

    @JsonProperty("NetPriceDiscount")
    public void setNetPriceDiscount(Integer netPriceDiscount) {
        this.netPriceDiscount = netPriceDiscount;
    }

    @JsonProperty("NetPriceWithDiscount")
    public Double getNetPriceWithDiscount() {
        return netPriceWithDiscount;
    }

    @JsonProperty("NetPriceWithDiscount")
    public void setNetPriceWithDiscount(Double netPriceWithDiscount) {
        this.netPriceWithDiscount = netPriceWithDiscount;
    }

    @JsonProperty("Tax")
    public Double getTax() {
        return tax;
    }

    @JsonProperty("Tax")
    public void setTax(Double tax) {
        this.tax = tax;
    }

    @JsonProperty("TaxDiscount")
    public Integer getTaxDiscount() {
        return taxDiscount;
    }

    @JsonProperty("TaxDiscount")
    public void setTaxDiscount(Integer taxDiscount) {
        this.taxDiscount = taxDiscount;
    }

    @JsonProperty("TaxWithDiscount")
    public Double getTaxWithDiscount() {
        return taxWithDiscount;
    }

    @JsonProperty("TaxWithDiscount")
    public void setTaxWithDiscount(Double taxWithDiscount) {
        this.taxWithDiscount = taxWithDiscount;
    }

    @JsonProperty("CalculationDetails")
    public CalculationDetails getCalculationDetails() {
        return calculationDetails;
    }

    @JsonProperty("CalculationDetails")
    public void setCalculationDetails(CalculationDetails calculationDetails) {
        this.calculationDetails = calculationDetails;
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
