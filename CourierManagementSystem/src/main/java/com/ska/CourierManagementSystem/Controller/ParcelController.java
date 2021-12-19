package com.ska.CourierManagementSystem.Controller;

import com.ska.CourierManagementSystem.Dao.ParcelRepo;
import com.ska.CourierManagementSystem.Models.Parcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ParcelController {

    @Autowired
    ParcelRepo parcelRepo;

    @RequestMapping("/getParcelDetails")
    public Iterable<Parcel> getAllParcelDetails(){
        return parcelRepo.findAll();
    }


}
