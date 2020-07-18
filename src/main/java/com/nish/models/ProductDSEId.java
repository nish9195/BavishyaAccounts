package com.nish.models;

import java.io.Serializable;

public class ProductDSEId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int product;
	
	private int dse;
	
	public ProductDSEId() {}

	public ProductDSEId(int product, int dse) {
		super();
		this.product = product;
		this.dse = dse;
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public int getDse() {
		return dse;
	}

	public void setDse(int dse) {
		this.dse = dse;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ProductDSEId [product=" + product + ", dse=" + dse + "]";
	}

}
