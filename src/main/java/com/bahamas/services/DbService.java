package com.bahamas.services;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bahamas.domain.ClientInvoice;
import com.bahamas.repositories.ClientInvoiceRepo;

@Service
public class DbService {

	@Autowired
	private ClientInvoiceRepo repo;

	public void instanceDataBase() {

		DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		ClientInvoice c1 = new ClientInvoice(1234, "bob", "Bob@bob.com");

		repo.saveAll(Arrays.asList(c1));

	}

}
