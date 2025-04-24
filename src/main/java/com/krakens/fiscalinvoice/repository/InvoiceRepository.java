package com.krakens.fiscalinvoice.repository;

import com.krakens.fiscalinvoice.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
