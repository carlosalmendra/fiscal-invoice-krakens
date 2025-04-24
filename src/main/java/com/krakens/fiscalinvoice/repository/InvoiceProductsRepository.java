package com.krakens.fiscalinvoice.repository;

import com.krakens.fiscalinvoice.entity.InvoiceProducts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceProductsRepository extends JpaRepository<InvoiceProducts, Integer> {
}
