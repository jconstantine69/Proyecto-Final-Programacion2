/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkplus;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author valen
 */
public class Area {
    private final String id;
    private String fullName;
    private int capacity;
    private final VehicleType type;
    private final Map<String, Spot> spots = new LinkedHashMap<>();

    public Area(String id, String fullName, int capacity, VehicleType type) {
        if (id == null || id.isBlank())
            throw new IllegalArgumentException("El ID del área es obligatorio");
        if (capacity <= 0)
            throw new IllegalArgumentException("La capacidad debe ser mayor a 0");
        this.id = id.trim();
        this.fullName = Objects.requireNonNull(fullName, "El nombre del área es obligatorio").trim();
        this.capacity = capacity;
        this.type = Objects.requireNonNull(type, "El tipo de vehículo del área es obligatorio");
    }

    public String getId() { return id; }

    public String getFullName() { return fullName; }

    public int getCapacity() { return capacity; }

    public VehicleType getType() { return type; }

    public Collection<Spot> getSpots() {
        return Collections.unmodifiableCollection(spots.values());
    }

    public void setFullName(String fullName) {
        this.fullName = fullName.trim();
    }

    public void setCapacity(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("La capacidad debe ser mayor a 0");
        this.capacity = capacity;
    }

    public void addSpot(Spot spot) {
        if (!spot.getType().equals(this.type))
            throw new IllegalArgumentException("El tipo de espacio no coincide con el tipo de área");
        if (spots.size() >= capacity)
            throw new IllegalStateException("El área ya está llena");
        spots.put(spot.getId(), spot);
    }

    public int occupiedCount() {
        return (int) spots.values().stream()
                .filter(s -> s.getStatus() == SpotStatus.OCUPADO)
                .count();
    }

    public boolean hasSpace() {
        return occupiedCount() < capacity;
    }

    public Spot freeSpot() {
        return spots.values().stream()
                .filter(s -> s.getStatus() == SpotStatus.LIBRE)
                .findFirst()
                .orElse(null);
    }

    public List<Spot> freeSpots() {
        return spots.values().stream()
                .filter(s -> s.getStatus() == SpotStatus.LIBRE)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Area{" + id + ", " + fullName + ", " + type + ", " +
                occupiedCount() + "/" + capacity + "}";
    }
}
