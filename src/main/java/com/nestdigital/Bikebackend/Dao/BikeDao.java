package com.nestdigital.Bikebackend.Dao;

import com.nestdigital.Bikebackend.Model.BikeModel;
import org.springframework.data.repository.CrudRepository;

public interface BikeDao extends CrudRepository<BikeModel,Integer> {
}
