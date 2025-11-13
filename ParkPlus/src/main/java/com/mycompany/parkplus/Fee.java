/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkplus;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Objects;

/**
 *
 * @author valen
 */
public class Fee {
    private final int id;
    private final FeeMode mode;
    private final BigDecimal flatAmount;       // para tarifas FLAT
    private final BigDecimal fractionRate;     // para tarifas VARIABLE
    private final int fractionMinutes;         // minutos por fracción

    public Fee(int id, FeeMode mode, BigDecimal flatAmount,
               BigDecimal fractionRate, Integer fractionMinutes) {

        this.id = id;
        this.mode = Objects.requireNonNull(mode, "El modo de tarifa es obligatorio");

        if (mode == FeeMode.FLAT) {
            this.flatAmount = requirePositive(flatAmount, "La tarifa fija debe ser mayor a 0");
            this.fractionRate = null;
            this.fractionMinutes = 0;
        } else {
            this.flatAmount = null;
            this.fractionRate = requirePositive(fractionRate, "La tarifa por fracción debe ser mayor a 0");
            this.fractionMinutes = Objects.requireNonNull(fractionMinutes, "Los minutos por fracción son obligatorios");
            if (this.fractionMinutes <= 0)
                throw new IllegalArgumentException("Los minutos por fracción deben ser mayores a 0");
        }
    }

    private static BigDecimal requirePositive(BigDecimal value, String message) {
        if (value == null || value.signum() <= 0)
            throw new IllegalArgumentException(message);
        return value;
    }

    public int getId() { return id; }

    public FeeMode getMode() { return mode; }

    public BigDecimal getFlatAmount() { return flatAmount; }

    public BigDecimal getFractionRate() { return fractionRate; }

    public int getFractionMinutes() { return fractionMinutes; }

    public BigDecimal calculateVariableAmount(Duration duration) {
        if (mode != FeeMode.VARIABLE)
            throw new IllegalStateException("Esta tarifa no es variable");

        long minutes = Math.max(1, duration.toMinutes());
        long segments = (long) Math.ceil(minutes / (double) fractionMinutes);
        return fractionRate.multiply(BigDecimal.valueOf(segments));
    }

    @Override
    public String toString() {
        if (mode == FeeMode.FLAT)
            return "Fee{FLAT, monto=" + flatAmount + "}";
        else
            return "Fee{VARIABLE, " + fractionRate + " cada " + fractionMinutes + " min}";
    }
}
