/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campuspark

import java.util.List;

/**
 *
 * @author valen
 */
public abstract class ParkingClient {
    private String name; // nombre
    private String nationalId; // numero de identificacion nacional (DPI o pasaporte)
    private List<Vehicle> vehicles; // lista de vehiculos relacionados con el cliente en cuestion

    public ParkingClient (String name, String nationalId, List<Vehicle> vehicles) {
        this.name = name;
        this.nationalId = nationalId;
        this.vehicles = vehicles;
    }

    public String getName () {
        return name;
    }

    public String getNationalId () {
        return nationalId;
    }

    public List<Vehicle> getVehicles () {
        return vehicles;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setNationalId (String nationalId) {
        this.nationalId = nationalId;
    }

    public void setVehicles (List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    
}
