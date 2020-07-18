package com.nish.models;

import java.io.Serializable;

public class ProductShopId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int product;
	
	private int shop;
	
	public ProductShopId() {}

	public ProductShopId(int product, int shop) {
		super();
		this.product = product;
		this.shop = shop;
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public int getShop() {
		return shop;
	}

	public void setShop(int shop) {
		this.shop = shop;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ProductShopId [product=" + product + ", shop=" + shop + "]";
	}

}
