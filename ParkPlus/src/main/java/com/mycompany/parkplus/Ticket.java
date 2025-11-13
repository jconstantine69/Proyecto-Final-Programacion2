/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkplus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author valen
 */
public class Ticket {
    private final String id;
    private final Vehicle vehicle;
    private final Spot spot;
    private final Area area;
    private final Fee fee;
    private final FeeMode mode;
    private TicketStatus status;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private LocalDateTime expirationTime;
    private BigDecimal amount;

    public Ticket(String id, Vehicle vehicle, Spot spot, Area area, Fee fee, FeeMode mode) {
        this.id = Objects.requireNonNull(id, "El ID del ticket es obligatorio");
        this.vehicle = Objects.requireNonNull(vehicle, "El vehículo es obligatorio");
        this.spot = Objects.requireNonNull(spot, "El espacio es obligatorio");
        this.area = Objects.requireNonNull(area, "El área es obligatoria");
        this.fee = Objects.requireNonNull(fee, "La tarifa es obligatoria");
        this.mode = Objects.requireNonNull(mode, "El modo de tarifa es obligatorio");
        this.entryTime = LocalDateTime.now();
        this.status = TicketStatus.ACTIVO;

        if (mode == FeeMode.FLAT) {
            this.amount = fee.getFlatAmount();
            this.expirationTime = entryTime.plusHours(24);
        } else {
            this.amount = BigDecimal.ZERO;
        }
    }

    public String getId() { return id; }

    public Vehicle getVehicle() { return vehicle; }

    public Spot getSpot() { return spot; }

    public Area getArea() { return area; }

    public Fee getFee() { return fee; }

    public FeeMode getMode() { return mode; }

    public TicketStatus getStatus() { return status; }

    public LocalDateTime getEntryTime() { return entryTime; }

    public LocalDateTime getExitTime() { return exitTime; }

    public LocalDateTime getExpirationTime() { return expirationTime; }

    public BigDecimal getAmount() { return amount; }

    public void closeTicket(BigDecimal amount) {
        if (status == TicketStatus.CERRADO)
            throw new IllegalStateException("El ticket ya está cerrado");
        this.amount = amount;
        this.exitTime = LocalDateTime.now();
        this.status = TicketStatus.CERRADO;
        this.spot.release();
    }

    public void expireIfNeeded() {
        if (mode == FeeMode.FLAT && status == TicketStatus.ACTIVO&& expirationTime != null) {
            if (LocalDateTime.now().isAfter(expirationTime)) {
                this.status = TicketStatus.EXPIRADO;
                this.spot.release();
            }
        }
    }

    @Override
    public String toString() {
        return "Ticket{" + id + ", " + vehicle.getPlate() + ", " + status + "}";
    }
}
