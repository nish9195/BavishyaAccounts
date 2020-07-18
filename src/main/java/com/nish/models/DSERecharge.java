package com.nish.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DSERecharge {
	
	@Id
	@GeneratedValue(generator="transactionId")
	private int transactionId;
	
	@ManyToOne
	@JoinColumn(name="dse_id")
	private DSE dse;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	private double amount;
	
	private LocalDate transactionTime;
	
	private String transactionType;
	
	public DSERecharge() {}

	public DSERecharge(int transactionId, DSE dse, Product product, double amount, LocalDate transactionTime,
			String transactionType) {
		super();
		this.transactionId = transactionId;
		this.dse = dse;
		this.product = product;
		this.amount = amount;
		this.transactionTime = transactionTime;
		this.transactionType = transactionType;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public DSE getDse() {
		return dse;
	}

	public void setDse(DSE dse) {
		this.dse = dse;
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

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		return "DSERecharge [transactionId=" + transactionId + ", dse=" + dse + ", product=" + product + ", amount="
				+ amount + ", transactionTime=" + transactionTime + ", transactionType=" + transactionType + "]";
	}

}
