/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campusparkingmanager;

/**
 *
 * @author valen
 */
public class VehicleType {
    private String brand; // la marca del vehiculo
    private String model; // corolla, rav4, etc
    private String category; // compacto, SUV, etc.

    public VehicleType (String brand, String model, String category) {
        this.brand = brand;
        this.model = model;
        this.category = category;
    }

    public String getBrand () {
        return brand;
    }

    public String getModel () {
        return model;
    }

    public String getCategory () {
        return category;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public void setCategory (String category) {
        this.category = category;
    }

    
}
