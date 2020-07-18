package com.nish.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(generator="productId")
	private int productId;
	
	private String productName;
	
	@OneToMany(mappedBy="product")
	private List<ProductDistributor> productDistributors;
	
	@OneToMany(mappedBy="product")
	private List<ProductDSE> productDSEs;
	
	@OneToMany(mappedBy="product")
	private List<ProductShop> productShops;
	
	@OneToMany(mappedBy="product")
	private List<DistributorRecharge> distributorRecharges;
	
	@OneToMany(mappedBy="product")
	private List<DSERecharge> dseRecharges;
	
	@OneToMany(mappedBy="product")
	private List<ShopRecharge> shopRecharges;
	
	public Product() {}

	public Product(int productId, String productName, List<ProductDistributor> productDistributors,
			List<ProductDSE> productDSEs, List<ProductShop> productShops,
			List<DistributorRecharge> distributorRecharges, List<DSERecharge> dseRecharges,
			List<ShopRecharge> shopRecharges) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDistributors = productDistributors;
		this.productDSEs = productDSEs;
		this.productShops = productShops;
		this.distributorRecharges = distributorRecharges;
		this.dseRecharges = dseRecharges;
		this.shopRecharges = shopRecharges;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<ProductDistributor> getProductDistributors() {
		return productDistributors;
	}

	public void setProductDistributors(List<ProductDistributor> productDistributors) {
		this.productDistributors = productDistributors;
	}

	public List<ProductDSE> getProductDSEs() {
		return productDSEs;
	}

	public void setProductDSEs(List<ProductDSE> productDSEs) {
		this.productDSEs = productDSEs;
	}

	public List<ProductShop> getProductShops() {
		return productShops;
	}

	public void setProductShops(List<ProductShop> productShops) {
		this.productShops = productShops;
	}

	public List<DistributorRecharge> getDistributorRecharges() {
		return distributorRecharges;
	}

	public void setDistributorRecharges(List<DistributorRecharge> distributorRecharges) {
		this.distributorRecharges = distributorRecharges;
	}

	public List<DSERecharge> getDseRecharges() {
		return dseRecharges;
	}

	public void setDseRecharges(List<DSERecharge> dseRecharges) {
		this.dseRecharges = dseRecharges;
	}

	public List<ShopRecharge> getShopRecharges() {
		return shopRecharges;
	}

	public void setShopRecharges(List<ShopRecharge> shopRecharges) {
		this.shopRecharges = shopRecharges;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDistributors="
				+ productDistributors + ", productDSEs=" + productDSEs + ", productShops=" + productShops
				+ ", distributorRecharges=" + distributorRecharges + ", dseRecharges=" + dseRecharges
				+ ", shopRecharges=" + shopRecharges + "]";
	}

}
