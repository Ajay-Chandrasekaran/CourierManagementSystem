package com.ska.CourierManagementSystem.Models;

import javax.persistence.*;

@Entity
public class DeliveryPerson {

    private int deliveryPersonID;
    private Location currentLocationDetails;
    private Employee employee;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employeeID")
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Id
    @GeneratedValue
    public int getDeliveryPersonID() {
        return deliveryPersonID;
    }

    public void setDeliveryPersonID(int deliveryPersonID) {
        this.deliveryPersonID = deliveryPersonID;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "currentLocationID")
    public Location getCurrentLocationDetails() {
        return currentLocationDetails;
    }

    public void setCurrentLocationDetails(Location currentLocationDetails) {
        this.currentLocationDetails = currentLocationDetails;
    }
}
