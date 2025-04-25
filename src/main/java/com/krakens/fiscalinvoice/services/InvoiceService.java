package com.krakens.fiscalinvoice.services;

import com.krakens.fiscalinvoice.dto.InvoiceRequestDTO;
import com.krakens.fiscalinvoice.entity.Invoice;
import com.krakens.fiscalinvoice.entity.InvoiceProducts;
import com.krakens.fiscalinvoice.repository.InvoiceProductsRepository;
import com.krakens.fiscalinvoice.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private InvoiceProductsRepository invoiceProductsRepository;

    public void createInvoice(InvoiceRequestDTO invoiceRequest) {
        Invoice invoice = new Invoice(invoiceRequest.getInvoice());
        InvoiceProducts invoiceProducts = new InvoiceProducts(invoiceRequest.getInvoiceProduct());
        invoiceProductsRepository.save(invoiceProducts);
        invoiceRepository.save(invoice);
    }
}
