package com.bahamas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClientInvoice implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_fiscal;
	private String name;
	private String email;
	
	public ClientInvoice() {
		
	}
	
	
	public ClientInvoice(Integer id_fiscal, String name, String emai) {
		super();
		this.id_fiscal = id_fiscal;
		this.name = name;
		this.email = emai;
	}
	public Integer getId_fiscal() {
		return id_fiscal;
	}
	public void setId_fiscal(Integer id_fiscal) {
		this.id_fiscal = id_fiscal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String emai) {
		this.email = emai;
	}


	@Override
	public String toString() {
		return "Client [id_fiscal=" + id_fiscal + "]";
	}

	
	

}
