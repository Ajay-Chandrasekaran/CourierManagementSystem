package com.ska.CourierManagementSystem.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ParcelDescription {

    private int parcelDescID;
    private String weightRange;
    private String sizeRange;
    private double basePrize;
    private String serviceType;

    @Id
    @GeneratedValue
    public int getParcelDescID() {
        return parcelDescID;
    }

    public void setParcelDescID(int parcelDescID) {
        this.parcelDescID = parcelDescID;
    }

    public String getWeightRange() {
        return weightRange;
    }

    public void setWeightRange(String weightRange) {
        this.weightRange = weightRange;
    }

    public String getSizeRange() {
        return sizeRange;
    }

    public void setSizeRange(String sizeRange) {
        this.sizeRange = sizeRange;
    }

    public double getBasePrize() {
        return basePrize;
    }

    public void setBasePrize(double basePrize) {
        this.basePrize = basePrize;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
