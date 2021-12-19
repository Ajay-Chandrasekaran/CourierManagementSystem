package com.ska.CourierManagementSystem.Dao;

import com.ska.CourierManagementSystem.Models.Parcel;
import org.springframework.data.repository.CrudRepository;

public interface ParcelRepo extends CrudRepository<Parcel,Integer> {
}
