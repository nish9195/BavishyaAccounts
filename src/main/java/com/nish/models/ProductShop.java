package com.nish.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ProductShopId.class)
public class ProductShop {
	
	@Id
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	@Id
	@ManyToOne
	@JoinColumn(name="shop_id")
	private Shop shop;
	
	private double outstanding;
	
	public ProductShop() {}

	public ProductShop(Product product, Shop shop, double outstanding) {
		super();
		this.product = product;
		this.shop = shop;
		this.outstanding = outstanding;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public double getOutstanding() {
		return outstanding;
	}

	public void setOutstanding(double outstanding) {
		this.outstanding = outstanding;
	}

	@Override
	public String toString() {
		return "ProductShop [product=" + product + ", shop=" + shop + ", outstanding=" + outstanding + "]";
	}

}
