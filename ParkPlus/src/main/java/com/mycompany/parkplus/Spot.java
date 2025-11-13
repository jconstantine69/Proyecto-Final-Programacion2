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
public class Spot {
    private final String id;
    private final VehicleType type;
    private SpotStatus status;
    private final Area area;

    public Spot(String id, VehicleType type, Area area) {
        if (id == null || id.isBlank())
            throw new IllegalArgumentException("El ID del espacio es obligatorio");
        this.id = id.trim();
        this.type = Objects.requireNonNull(type, "El tipo de espacio es obligatorio");
        this.area = Objects.requireNonNull(area, "El área es obligatoria");
        if (!type.equals(area.getType()))
            throw new IllegalArgumentException("El tipo de espacio no coincide con el área");
        this.status = SpotStatus.LIBRE;
    }

    public String getId() { return id; }

    public VehicleType getType() { return type; }

    public SpotStatus getStatus() { return status; }

    public Area getArea() { return area; }

    public void occupy() {
        if (status == SpotStatus.OCUPADO)
            throw new IllegalStateException("El espacio ya está ocupado");
        status = SpotStatus.OCUPADO;
    }

    public void release() {
        if (status == SpotStatus.LIBRE) return;
        status = SpotStatus.LIBRE;
    }

    public boolean isFree() { return status == SpotStatus.LIBRE; }

    @Override
    public String toString() {
        return "Spot{" + id + ", " + status + "}";
    }

    Object getType () {
        throw new UnsupportedOperationException ("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
