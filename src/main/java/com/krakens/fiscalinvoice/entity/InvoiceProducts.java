package com.krakens.fiscalinvoice.entity;

import com.krakens.fiscalinvoice.dto.InvoiceProductsDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class InvoiceProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sku;
    private String description;
    private BigDecimal price;
    private double tax;
    private BigDecimal total;

    public InvoiceProducts(InvoiceProductsDTO invoiceProductsDTO) {
        this.id = invoiceProductsDTO.getId();
        this.sku = invoiceProductsDTO.getSku();
        this.description = invoiceProductsDTO.getDescription();
        this.price = invoiceProductsDTO.getPrice();
        this.tax = invoiceProductsDTO.getTax();
        this.total = invoiceProductsDTO.getTotal();
    }
}
