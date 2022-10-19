package com.nestdigital.Bikebackend.Controller;

import com.nestdigital.Bikebackend.Dao.BikeDao;
import com.nestdigital.Bikebackend.Model.BikeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BikeController {

    @Autowired
    private BikeDao dao;



    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addBike",consumes = "application/json",produces = "application/json")
    public String addBike(@RequestBody BikeModel bike){
        dao.save(bike);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewBike")
    public List<BikeModel> viewBike(){
        return (List<BikeModel>) dao.findAll();
    }
}
