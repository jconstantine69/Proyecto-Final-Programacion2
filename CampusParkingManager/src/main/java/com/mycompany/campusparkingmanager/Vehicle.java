/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campusparkingmanager;

/**
 *
 * @author valen
 */
public class Vehicle {
    private String plateNumber; // numero de placa del vehiculo
    private String color; // color del vehiculo
    private VehicleType type; // puntero hacia las caracterisitcas comunes del vehiculo en cuestion
    private VehicleCategory category; // Categoria del vehiculo (auto, motocicleta, bicicleta)

    public Vehicle (String plateNumber, String color, VehicleType type, VehicleCategory category) {
        this.plateNumber = plateNumber;
        this.color = color;
        this.type = type;
        this.category = category;
    }

    public String getPlateNumber () {
        return plateNumber;
    }

    public String getColor () {
        return color;
    }

    public VehicleType getType () {
        return type;
    }

    public VehicleCategory getCategory () {
        return category;
    }

    public void setPlateNumber (String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setType (VehicleType type) {
        this.type = type;
    }

    public void setCategory (VehicleCategory category) {
        this.category = category;
    }

    
}
