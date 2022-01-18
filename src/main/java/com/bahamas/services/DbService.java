package com.bahamas.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bahamas.domain.ClientInvoice;
import com.bahamas.domain.Invoice;
import com.bahamas.repositories.ClientInvoiceRepo;
import com.bahamas.repositories.InvoiceRepo;

@Service
public class DbService {

	@Autowired
	private ClientInvoiceRepo repo;

	@Autowired
	private InvoiceRepo invoiceRepo;

	public void instanceDataBase() {

		Invoice inv1 = new Invoice(1234);

		ClientInvoice c1 = new ClientInvoice(null, "bob", "Bob@bob.com");

		inv1.getClient().addAll(Arrays.asList(c1));

		c1.getInvoices().addAll(Arrays.asList(inv1));

		invoiceRepo.saveAll(Arrays.asList(inv1));
		repo.saveAll(Arrays.asList(c1));

	}

}
