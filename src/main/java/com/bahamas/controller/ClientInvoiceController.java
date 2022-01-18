package com.bahamas.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bahamas.domain.ClientInvoice;
import com.bahamas.services.ClientInvoiceService;

@RestController
@RequestMapping(value = "store-bahamas-client")
public class ClientInvoiceController {

	@Autowired
	private ClientInvoiceService repoService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<ClientInvoice> findById(@PathVariable Integer id) {
		ClientInvoice obj = repoService.findById(id);
		return ResponseEntity.ok().body(obj);

	}

	@PostMapping
	public ResponseEntity<ClientInvoice> create(@RequestBody ClientInvoice obj) {
		obj = repoService.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(obj.getId_fiscal())
				.toUri();

		return ResponseEntity.created(uri).body(obj);

	}

}
