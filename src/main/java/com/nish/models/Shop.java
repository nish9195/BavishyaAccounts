package com.nish.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Shop {
	
	@Id
	@GeneratedValue(generator="userId")
	private int shopId;
	
	private String shopName;
	
	private String email;
	
	private String phoneNo;
	
	private String password;
	
	@ManyToOne
	@JoinColumn(name="dse_id")
	private DSE dse;
	
	@OneToMany(mappedBy="shop")
	private List<ProductShop> productShops;
	
	@OneToMany(mappedBy="shop")
	private List<ShopRecharge> shopRecharges;
	
	public Shop() {}

	public Shop(int shopId, String shopName, String email, String phoneNo, String password, DSE dse,
			List<ProductShop> productShops, List<ShopRecharge> shopRecharges) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.password = password;
		this.dse = dse;
		this.productShops = productShops;
		this.shopRecharges = shopRecharges;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public DSE getDse() {
		return dse;
	}

	public void setDse(DSE dse) {
		this.dse = dse;
	}

	public List<ProductShop> getProductShops() {
		return productShops;
	}

	public void setProductShops(List<ProductShop> productShops) {
		this.productShops = productShops;
	}

	public List<ShopRecharge> getShopRecharges() {
		return shopRecharges;
	}

	public void setShopRecharges(List<ShopRecharge> shopRecharges) {
		this.shopRecharges = shopRecharges;
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", password=" + password + ", dse=" + dse + ", productShops=" + productShops + ", shopRecharges="
				+ shopRecharges + "]";
	}

}
