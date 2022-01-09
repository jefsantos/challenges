package com.bahamas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bahamas.domain.ClientInvoice;
import com.bahamas.services.ClientInvoiceService;

@RestController
@RequestMapping(value = "store-bahamas-client")
public class ClientInvoiceController {
	
	@Autowired
	private ClientInvoiceService repoService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ClientInvoice> findById(@PathVariable Integer id){
		ClientInvoice obj = repoService.findById(id);
		return ResponseEntity.ok().body(obj);
		
		
	}

}
