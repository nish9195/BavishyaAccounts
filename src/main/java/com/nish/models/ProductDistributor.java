package com.nish.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ProductDistributorId.class)
public class ProductDistributor {
	
	@Id
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	@Id
	@ManyToOne
	@JoinColumn(name="distributor_id")
	private Distributor distributor;
	
	private double balance;
	
	public ProductDistributor() {}

	public ProductDistributor(Product product, Distributor distributor, double balance) {
		super();
		this.product = product;
		this.distributor = distributor;
		this.balance = balance;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Distributor getDistributor() {
		return distributor;
	}

	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "ProductDistributor [product=" + product + ", distributor=" + distributor + ", balance=" + balance + "]";
	}

}
