package com.nish.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class DSE {
	
	@Id
	@GeneratedValue(generator="userId")
	private int dseId;
	
	private String dseName;
	
	private String email;
	
	private String phoneNo;
	
	private String password;
	
	@ManyToOne
	@JoinColumn(name="distributor_id")
	private Distributor distributor;
	
	@OneToMany(mappedBy="dse")
	@JsonBackReference(value = "shops")
	private List<Shop> shops;
	
	@OneToMany(mappedBy="dse")
	private List<ProductDSE> productDSEs;
	
	@OneToMany(mappedBy="dse")
	private List<DSERecharge> dseRecharges;
	
	public DSE() {}

	public DSE(int dseId, String dseName, String email, String phoneNo, String password, Distributor distributor,
			List<Shop> shops, List<ProductDSE> productDSEs, List<DSERecharge> dseRecharges) {
		super();
		this.dseId = dseId;
		this.dseName = dseName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.password = password;
		this.distributor = distributor;
		this.shops = shops;
		this.productDSEs = productDSEs;
		this.dseRecharges = dseRecharges;
	}

	public int getDseId() {
		return dseId;
	}

	public void setDseId(int dseId) {
		this.dseId = dseId;
	}

	public String getDseName() {
		return dseName;
	}

	public void setDseName(String dseName) {
		this.dseName = dseName;
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

	public Distributor getDistributor() {
		return distributor;
	}

	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}

	public List<Shop> getShops() {
		return shops;
	}

	public void setShops(List<Shop> shops) {
		this.shops = shops;
	}

	public List<ProductDSE> getProductDSEs() {
		return productDSEs;
	}

	public void setProductDSEs(List<ProductDSE> productDSEs) {
		this.productDSEs = productDSEs;
	}

	public List<DSERecharge> getDseRecharges() {
		return dseRecharges;
	}

	public void setDseRecharges(List<DSERecharge> dseRecharges) {
		this.dseRecharges = dseRecharges;
	}

	@Override
	public String toString() {
		return "DSE [dseId=" + dseId + ", dseName=" + dseName + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", password=" + password + ", distributor=" + distributor + ", shops=" + shops + ", productDSEs="
				+ productDSEs + ", dseRecharges=" + dseRecharges + "]";
	}

}
