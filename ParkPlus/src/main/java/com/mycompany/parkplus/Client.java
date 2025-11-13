/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkplus;

import java.util.Objects;

/**
 *F
 * @author valen
 * 
 */
public class Client {
    private final int id;
    private String fullName;
    private ClientType type;

    public Client(int id, String fullName, ClientType type) {
        if (fullName == null || fullName.isBlank())
            throw new IllegalArgumentException("El nombre completo es obligatorio");
        this.id = id;
        this.fullName = fullName.trim();
        this.type = Objects.requireNonNull(type, "El tipo de cliente es obligatorio");
    }

    public int getId() { return id; }

    public String getFullName() { return fullName; }

    public ClientType getType() { return type; }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isBlank())
            throw new IllegalArgumentException("El nombre completo es obligatorio");
        this.fullName = fullName.trim();
    }

    public void setType(ClientType type) {
        this.type = Objects.requireNonNull(type, "El tipo de cliente es obligatorio");
    }

    @Override
    public String toString() {
        return "Client{" + id + ", " + fullName + ", " + type + "}";
    }
}
