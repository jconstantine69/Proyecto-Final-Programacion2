/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campusparkingmanager;

import java.time.LocalDateTime;


/**
 *
 * @author valen
 */
public class Ticket {
    private int ticketNumber; // numero de ticket unico
    private ParkingClient client; // puntero hacia el cliente en cuestion
    private LocalDateTime entryTime; // hora de entrada
    private int parkingSpotNumber; // lugar asignado para aparcar

    public Ticket (int ticketNumber, ParkingClient client, LocalDateTime entryTime, int parkingSpotNumber) {
        this.ticketNumber = ticketNumber;
        this.client = client;
        this.entryTime = entryTime;
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public int getTicketNumber () {
        return ticketNumber;
    }

    public ParkingClient getClient () {
        return client;
    }

    public LocalDateTime getEntryTime () {
        return entryTime;
    }

    public int getParkingSpotNumber () {
        return parkingSpotNumber;
    }

    public void setTicketNumber (int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setClient (ParkingClient client) {
        this.client = client;
    }

    public void setEntryTime (LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public void setParkingSpotNumber (int parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    
}
