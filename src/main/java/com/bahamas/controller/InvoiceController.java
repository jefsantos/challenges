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

import com.bahamas.domain.Invoice;
import com.bahamas.services.InvoiceService;

@RestController
@RequestMapping(value = "invoice")
public class InvoiceController {

	@Autowired
	private InvoiceService repoService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Invoice> findById(@PathVariable Integer id) {
		Invoice obj = repoService.findById(id);
		return ResponseEntity.ok().body(obj);

	}

	@PostMapping
	public ResponseEntity<Invoice> create(@RequestBody Invoice obj) {
		obj = repoService.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(obj.getInvoiceId())
				.toUri();

		return ResponseEntity.created(uri).body(obj);

	}

}
