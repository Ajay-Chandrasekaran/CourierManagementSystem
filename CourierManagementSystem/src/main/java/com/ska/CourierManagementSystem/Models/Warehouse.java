package com.ska.CourierManagementSystem.Models;

import javax.persistence.*;

@Entity
public class Warehouse {

    private int wareHouseID;
    private int capacity;
    private Location wareHouseLocationDetails;
    private Parcel parcel;



    @Id
    @GeneratedValue
    public int getWareHouseID() {
        return wareHouseID;
    }

    public void setWareHouseID(int wareHouseID) {
        this.wareHouseID = wareHouseID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wareHouseLocationID")
    public Location getWareHouseLocationDetails() {
        return wareHouseLocationDetails;
    }

    public void setWareHouseLocationDetails(Location wareHouseLocationDetails) {
        this.wareHouseLocationDetails = wareHouseLocationDetails;
    }

    @OneToMany(mappedBy = "wareHouseDetails")
    public Parcel getParcel() {
        return parcel;
    }

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }
}
