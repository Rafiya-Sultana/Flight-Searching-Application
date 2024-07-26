package com.flightsearchingapplication.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flight {
    @JsonProperty("partner_program")
    private String partner_program;
    @JsonProperty("min_business_miles")
    private Integer getMin_business_miles;
    @JsonProperty("min_business_tax")
    private Integer min_business_tax;
    @JsonProperty("min_economy_miles")
    private Integer min_economy_miles;
    @JsonProperty("min_economy_tax")
    private Integer min_economy_tax;
    @JsonProperty("min_first_miles")
    private Integer min_first_miles;
    @JsonProperty("min_first_tax")
    private Integer min_first_tax;

    public String getPartner_program() {
        return partner_program;
    }

    public void setPartner_program(String partner_program) {
        this.partner_program = partner_program;
    }

    public Integer getMin_business_miles() {
        return getMin_business_miles;
    }

    public void setMin_business_miles(Integer getMin_business_miles) {
        this.getMin_business_miles = getMin_business_miles;
    }

    public Integer getMin_business_tax() {
        return min_business_tax;
    }

    public void setMin_business_tax(Integer min_business_tax) {
        this.min_business_tax = min_business_tax;
    }

    public Integer getMin_economy_miles() {
        return min_economy_miles;
    }

    public void setMin_economy_miles(Integer min_economy_miles) {
        this.min_economy_miles = min_economy_miles;
    }

    public Integer getMin_economy_tax() {
        return min_economy_tax;
    }

    public void setMin_economy_tax(Integer min_economy_tax) {
        this.min_economy_tax = min_economy_tax;
    }

    public Integer getMin_first_miles() {
        return min_first_miles;
    }

    public void setMin_first_miles(Integer min_first_miles) {
        this.min_first_miles = min_first_miles;
    }

    public Integer getMin_first_tax() {
        return min_first_tax;
    }

    public void setMin_first_tax(Integer min_first_tax) {
        this.min_first_tax = min_first_tax;
    }
}
