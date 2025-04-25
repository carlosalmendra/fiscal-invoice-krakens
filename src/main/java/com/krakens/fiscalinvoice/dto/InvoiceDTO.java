package com.krakens.fiscalinvoice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class InvoiceDTO {

    private Long id;
    private String stateCode;
    private double taxRate;
    private double total;
}
