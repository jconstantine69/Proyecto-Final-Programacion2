/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campusparkingmanager;

import java.util.List;
import java.time.LocalDateTime;


/**
 *
 * @author valen
 */
public class Invoice {
    private int invoiceNumber; // numero unico de la factura
    private List<Ticket> tickets; // lista de tickets relacionado a la factura
    private LocalDateTime issueDate; // fecha de emision
    private double totalAmount; // monto total

    public Invoice (int invoiceNumber, List<Ticket> tickets, LocalDateTime issueDate, double totalAmount) {
        this.invoiceNumber = invoiceNumber;
        this.tickets = tickets;
        this.issueDate = issueDate;
        this.totalAmount = totalAmount;
    }

    public int getInvoiceNumber () {
        return invoiceNumber;
    }

    public List<Ticket> getTickets () {
        return tickets;
    }

    public LocalDateTime getIssueDate () {
        return issueDate;
    }

    public double getTotalAmount () {
        return totalAmount;
    }

    public void setInvoiceNumber (int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setTickets (List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void setIssueDate (LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    public void setTotalAmount (double totalAmount) {
        this.totalAmount = totalAmount;
    }

    
}
