package com.ska.CourierManagementSystem.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Parcel {

    private int parcelID;
    private double weight;
    private double totalCost;
    private String Status;
    private Date ExpectedDeliveryDate;
    private Payment paymentDetails;
    private ParcelDescription parcelDescription;
    private TrackingInformation trackingInformation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "trackingID")
    public TrackingInformation getTrackingInformation() {
        return trackingInformation;
    }

    public void setTrackingInformation(TrackingInformation trackingInformation) {
        this.trackingInformation = trackingInformation;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parcelDescID")
    public ParcelDescription getParcelDescription() {
        return parcelDescription;
    }

    public void setParcelDescription(ParcelDescription parcelDescription) {
        this.parcelDescription = parcelDescription;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentID")
    public Payment getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(Payment payment) {
        this.paymentDetails = payment;
    }

    @Id
    @GeneratedValue
    public int getParcelID() {
        return parcelID;
    }

    public void setParcelID(int ID) {
        this.parcelID = ID;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Date getExpectedDeliveryDate() {
        return ExpectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
        ExpectedDeliveryDate = expectedDeliveryDate;
    }

}
