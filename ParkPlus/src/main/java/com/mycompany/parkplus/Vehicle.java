/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkplus;

import java.util.Objects;

/**
 *
 * @author valen
 */
public class Vehicle {
    private final int id;
    private final String plate;
    private final VehicleType type;
    private final Client owner;

    public Vehicle(int id, String plate, VehicleType type, Client owner) {
        if (plate == null || plate.isBlank())
            throw new IllegalArgumentException("La placa del vehículo es obligatoria");
        this.id = id;
        this.plate = plate.trim().toUpperCase();
        this.type = Objects.requireNonNull(type, "El tipo de vehículo es obligatorio");
        this.owner = Objects.requireNonNull(owner, "El propietario es obligatorio");
    }

    public int getId() { return id; }

    public String getPlate() { return plate; }

    public VehicleType getType() { return type; }

    public Client getOwner() { return owner; }

    @Override
    public String toString() {
        return "Vehicle{" + plate + ", " + type + ", propietario=" + owner.getFullName() + "}";
    }
}
