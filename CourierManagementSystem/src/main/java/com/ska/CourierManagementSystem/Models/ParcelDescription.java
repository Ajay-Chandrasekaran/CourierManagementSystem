package com.ska.CourierManagementSystem.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ParcelDescription {

    private int parcelDescID;
    private double weightRange;
    private double sizeRange;
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

    public double getWeightRange() {
        return weightRange;
    }

    public void setWeightRange(double weightRange) {
        this.weightRange = weightRange;
    }

    public double getSizeRange() {
        return sizeRange;
    }

    public void setSizeRange(double sizeRange) {
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
