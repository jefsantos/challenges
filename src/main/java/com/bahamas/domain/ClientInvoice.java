package com.bahamas.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class ClientInvoice implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_fiscal;
	private String name;
	private String email;

	@JsonBackReference
	@ManyToMany
	@JoinTable(name = "CLI_INV", joinColumns = @JoinColumn(name = "clientInvoice_id"), inverseJoinColumns = @JoinColumn(name = "invoice_id"))
	private List<Invoice> invoices = new ArrayList<>();

	public ClientInvoice() {

	}

	public ClientInvoice(Integer id_fiscal, String name, String emai) {
		super();
		this.id_fiscal = id_fiscal;
		this.name = name;
		this.email = emai;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_fiscal == null) ? 0 : id_fiscal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientInvoice other = (ClientInvoice) obj;
		if (id_fiscal == null) {
			if (other.id_fiscal != null)
				return false;
		} else if (!id_fiscal.equals(other.id_fiscal))
			return false;
		return true;
	}

}
