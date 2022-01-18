package com.bahamas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bahamas.domain.ClientInvoice;
import com.bahamas.repositories.ClientInvoiceRepo;

@Service
public class ClientInvoiceService {
	
	@Autowired
	private ClientInvoiceRepo repo ;
	
	
	public ClientInvoice findById(Integer id) {
		
		 Optional<ClientInvoice> obj = repo.findById(id);
		 
		 return obj.orElse(null);
	}


	public ClientInvoice create(ClientInvoice obj) {
		obj.setId_fiscal(null);
		return repo.save(obj);
	}

}
