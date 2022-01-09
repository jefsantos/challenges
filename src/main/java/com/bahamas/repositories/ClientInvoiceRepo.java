package com.bahamas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bahamas.domain.ClientInvoice;

@Repository
public interface ClientInvoiceRepo  extends JpaRepository<ClientInvoice, Integer>{

}
