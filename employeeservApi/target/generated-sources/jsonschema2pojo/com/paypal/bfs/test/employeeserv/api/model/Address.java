
package com.paypal.bfs.test.employeeserv.api.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * address object
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lineOne",
    "lineTwo",
    "city",
    "state",
    "country",
    "zip_code"
})
public class Address {

    /**
     * Address Line One
     * 
     */
    @JsonProperty("lineOne")
    @JsonPropertyDescription("Address Line One")
    private Object lineOne;
    /**
     * Address Line two
     * 
     */
    @JsonProperty("lineTwo")
    @JsonPropertyDescription("Address Line two")
    private String lineTwo;
    /**
     * City
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("City")
    private String city;
    /**
     * State
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("State")
    private String state;
    /**
     * Country
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("Country")
    private String country;
    /**
     * zip_code
     * 
     */
    @JsonProperty("zip_code")
    @JsonPropertyDescription("zip_code")
    private String zipCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Address Line One
     * 
     */
    @JsonProperty("lineOne")
    public Object getLineOne() {
        return lineOne;
    }

    /**
     * Address Line One
     * 
     */
    @JsonProperty("lineOne")
    public void setLineOne(Object lineOne) {
        this.lineOne = lineOne;
    }

    /**
     * Address Line two
     * 
     */
    @JsonProperty("lineTwo")
    public String getLineTwo() {
        return lineTwo;
    }

    /**
     * Address Line two
     * 
     */
    @JsonProperty("lineTwo")
    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    /**
     * City
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * State
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Country
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Country
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * zip_code
     * 
     */
    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * zip_code
     * 
     */
    @JsonProperty("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lineOne");
        sb.append('=');
        sb.append(((this.lineOne == null)?"<null>":this.lineOne));
        sb.append(',');
        sb.append("lineTwo");
        sb.append('=');
        sb.append(((this.lineTwo == null)?"<null>":this.lineTwo));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
