package com.ska.CourierManagementSystem.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class DeliveryJob {

    private int deliveryJobID;
    private List<Parcel> parcelDetails;
    private DeliveryPerson deliveryPerson;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "deliveryPersonID")
    public DeliveryPerson getDeliveryPerson() {
        return deliveryPerson;
    }

    public void setDeliveryPerson(DeliveryPerson deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    @Id
    @GeneratedValue
    public int getDeliveryJobID() {
        return deliveryJobID;
    }

    public void setDeliveryJobID(int deliveryJobID) {
        this.deliveryJobID = deliveryJobID;
    }

    @OneToMany(mappedBy = "deliveryJob")
    public List<Parcel> getParcelDetails() {
        return parcelDetails;
    }

    public void setParcelDetails(List<Parcel> parcelDetails) {
        this.parcelDetails = parcelDetails;
    }
}
