package com.bahamas.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Invoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer invoiceId;

	@JsonManagedReference
	@ManyToMany(mappedBy = "invoices")
	private List<ClientInvoice> client = new ArrayList<>();

	public Invoice() {

	}

	public Invoice(Integer invoiceId) {
		super();
		this.invoiceId = invoiceId;
	}

	public List<ClientInvoice> getClient() {
		return client;
	}

	public void setClient(List<ClientInvoice> client) {
		this.client = client;
	}

	public Integer getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((invoiceId == null) ? 0 : invoiceId.hashCode());
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
		Invoice other = (Invoice) obj;
		if (invoiceId == null) {
			if (other.invoiceId != null)
				return false;
		} else if (!invoiceId.equals(other.invoiceId))
			return false;
		return true;
	}

	
	

}
