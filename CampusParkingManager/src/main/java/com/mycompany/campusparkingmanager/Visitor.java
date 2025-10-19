/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campusparkingmanager;

import java.util.List;

/**
 *
 * @author valen
 */
public class Visitor extends ParkingClient {

    public Visitor (String name, String nationalId, List<Vehicle> vehicles) {
        super (name, nationalId, vehicles);
    }
    
}
