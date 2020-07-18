package com.nish.models;

import java.io.Serializable;

public class ProductDistributorId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int product;
	
	private int distributor;
	
	public ProductDistributorId() {}

	public ProductDistributorId(int product, int distributor) {
		super();
		this.product = product;
		this.distributor = distributor;
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public int getDistributor() {
		return distributor;
	}

	public void setDistributor(int distributor) {
		this.distributor = distributor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ProductDistributorId [product=" + product + ", distributor=" + distributor + "]";
	}

}
