package com.ska.CourierManagementSystem.Models;

import javax.persistence.*;

@Entity
public class TrackingInformation {

    private int trackingInfoID;
    private Location source;
    private Location destination;

    @Id
    @GeneratedValue
    public int getTrackingInfoID() {
        return trackingInfoID;
    }

    public void setTrackingInfoID(int trackingInfoID) {
        this.trackingInfoID = trackingInfoID;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sourceLocationID")
    public Location getSource() {
        return source;
    }

    public void setSource(Location source) {
        this.source = source;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "destinationLocationID")
    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }
}
