package com.krakens.fiscalinvoice.controllers;

import com.krakens.fiscalinvoice.dto.InvoiceRequestDTO;
import com.krakens.fiscalinvoice.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping(value = "/add")
    private ResponseEntity<?> createInvoice(@RequestBody InvoiceRequestDTO invoiceRequest) {
        invoiceService.createInvoice(invoiceRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
