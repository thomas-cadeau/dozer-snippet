package com.gop.expertec.inheritance.uk;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Adress {

    private String streetAndNumber;
    private String zipCode;
    private String city;

    public Adress(String streetAndNumber, String zipCode, String city) {
        super();
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
        this.city = city;
    }

    public Adress() {
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE, false, false);
    }
}
