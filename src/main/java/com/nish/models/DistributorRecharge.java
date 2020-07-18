package com.nish.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DistributorRecharge {
	
	@Id
	@GeneratedValue(generator="transactionId")
	private int transactionId;
	
	@ManyToOne
	@JoinColumn(name="distributor_id")
	private Distributor distributor;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	private double amount;
	
	private LocalDate transactionTime;
	
	public DistributorRecharge() {}

	public DistributorRecharge(int transactionId, Distributor distributor, Product product, double amount,
			LocalDate transactionTime) {
		super();
		this.transactionId = transactionId;
		this.distributor = distributor;
		this.product = product;
		this.amount = amount;
		this.transactionTime = transactionTime;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Distributor getDistributor() {
		return distributor;
	}

	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(LocalDate transactionTime) {
		this.transactionTime = transactionTime;
	}

	@Override
	public String toString() {
		return "DistributorRecharge [transactionId=" + transactionId + ", distributor=" + distributor + ", product="
				+ product + ", amount=" + amount + ", transactionTime=" + transactionTime + "]";
	}

}
