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
public class Employee extends ParkingClient {
    private String employeeId; // numero de identificacion
    private String position; // puesto o cargo del empleado

    public Employee (String employeeId, String position, String name, String nationalId, List<Vehicle> vehicles) {
        super (name, nationalId, vehicles);
        this.employeeId = employeeId;
        this.position = position;
    }

    public String getEmployeeId () {
        return employeeId;
    }

    public String getPosition () {
        return position;
    }

    public void setEmployeeId (String employeeId) {
        this.employeeId = employeeId;
    }

    public void setPosition (String position) {
        this.position = position;
    }
    
    
}
