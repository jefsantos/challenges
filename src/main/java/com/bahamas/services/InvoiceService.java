package com.bahamas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bahamas.domain.Invoice;
import com.bahamas.repositories.InvoiceRepo;

@Service
public class InvoiceService {
	
	@Autowired
	private InvoiceRepo repo ;
	
	
	public Invoice findById(Integer id) {
		
		 Optional<Invoice> obj = repo.findById(id);
		 
		 return obj.orElse(null);
	}


	public Invoice create(Invoice obj) {
		obj.setInvoiceId(null);
		return repo.save(obj);
	}
	

}
