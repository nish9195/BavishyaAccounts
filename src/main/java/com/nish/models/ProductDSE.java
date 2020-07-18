package com.nish.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ProductDSEId.class)
public class ProductDSE {
	
	@Id
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	@Id
	@ManyToOne
	@JoinColumn(name="dse_id")
	private DSE dse;
	
	private double outstanding;
	
	public ProductDSE() {}

	public ProductDSE(Product product, DSE dse, double outstanding) {
		super();
		this.product = product;
		this.dse = dse;
		this.outstanding = outstanding;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public DSE getDse() {
		return dse;
	}

	public void setDse(DSE dse) {
		this.dse = dse;
	}

	public double getOutstanding() {
		return outstanding;
	}

	public void setOutstanding(double outstanding) {
		this.outstanding = outstanding;
	}

	@Override
	public String toString() {
		return "ProductDSE [product=" + product + ", dse=" + dse + ", outstanding=" + outstanding + "]";
	}

}
