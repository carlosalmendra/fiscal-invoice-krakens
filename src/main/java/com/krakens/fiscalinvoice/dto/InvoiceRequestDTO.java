package com.krakens.fiscalinvoice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class InvoiceRequestDTO {
    InvoiceDTO invoice;
    InvoiceProductsDTO invoiceProduct;



}
