package com.krakens.fiscalinvoice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class InvoiceProductsDTO {

    private Long id;
    private String sku;
    private String description;
    private BigDecimal price;
    private double tax;
    private BigDecimal total;
}
