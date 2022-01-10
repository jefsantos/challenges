package com.bahamas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bahamas.domain.Invoice;

@Repository
public interface InvoiceRepo  extends JpaRepository<Invoice, Integer>{

}
