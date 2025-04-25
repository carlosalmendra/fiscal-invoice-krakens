package com.krakens.fiscalinvoice.entity;

import com.krakens.fiscalinvoice.dto.InvoiceDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stateCode;
    private double taxRate;
    private double total;

    public Invoice (InvoiceDTO invoiceDTO) {
        this.id = invoiceDTO.getId();
        this.stateCode = invoiceDTO.getStateCode();
        this.taxRate = invoiceDTO.getTaxRate();
        this.total = invoiceDTO.getTotal();
    }
}


