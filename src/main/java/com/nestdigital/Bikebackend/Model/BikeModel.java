package com.nestdigital.Bikebackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bike")
public class BikeModel {

    @Id
    @GeneratedValue
    private int id;
    private String bikeName;
    private String company;
    private String description;

    public BikeModel() {
    }

    public BikeModel(int id, String bikeName, String company, String description) {
        this.id = id;
        this.bikeName = bikeName;
        this.company = company;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
