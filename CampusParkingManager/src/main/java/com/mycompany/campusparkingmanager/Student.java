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
public class Student extends ParkingClient {
    private String studentId; // numero de identificacion
    private String carreer; // carrera o facultad
    private String semester; // numero de ciclo

    public Student (String studentId, String carreer, String semester, String name, String nationalId, List<Vehicle> vehicles) {
        super (name, nationalId, vehicles);
        this.studentId = studentId;
        this.carreer = carreer;
        this.semester = semester;
    }

    public String getStudentId () {
        return studentId;
    }

    public String getCarreer () {
        return carreer;
    }

    public String getSemester () {
        return semester;
    }

    public void setStudentId (String studentId) {
        this.studentId = studentId;
    }

    public void setCarreer (String carreer) {
        this.carreer = carreer;
    }

    public void setSemester (String semester) {
        this.semester = semester;
    }
    
     
}
